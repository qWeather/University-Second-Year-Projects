package com.example.languagetranslatorapp;

import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;

import com.ibm.cloud.sdk.core.http.HttpMediaType;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.developer_cloud.android.library.audio.StreamPlayer;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.language_translator.v3.model.TranslationResult;
import com.ibm.watson.language_translator.v3.util.Language;
import com.ibm.watson.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.text_to_speech.v1.model.SynthesizeOptions;

//translate class to translate phrases and pronounce
public class Translate extends MainActivity {

    private LanguageTranslator translationService;
    private TextView translatedPhrase;
    private StreamPlayer player = new StreamPlayer();
    private TextToSpeech textService;
    private ListView list3;
    private Button translate;
    private Button pronounce;
    private Spinner subscribedLanguage;//spinner for available languages
    ArrayList<Phrase> phraseArrayList;//array for the stored values
    ArrayList<com.example.languagetranslatorapp.Language> languageArrayList;//array for the stored values

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        translatedPhrase = findViewById(R.id.translatedPhrase);//textview to display the translated phrase or word
        list3 = findViewById(R.id.list3);
        list3.setChoiceMode(ListView.CHOICE_MODE_SINGLE);//setting the choice mode of the list to single choice

        subscribedLanguage = findViewById(R.id.subscribedLanguage);
        languageArrayList = phrasesDatabase.languages();//storing the data from the database into the array
        //array to store the string values of the main array
        ArrayList<String> spinnerArray = new ArrayList<>();
        //loop to retrieve the values from the main array into the string array for displaying
        for(int i =0; i < languageArrayList.size(); i++) {
             spinnerArray.add(languageArrayList.get(i).getLanguage());
        }

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinnerArray);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subscribedLanguage.setAdapter(spinnerAdapter);

        translate = findViewById(R.id.translate);
        pronounce = findViewById(R.id.pronounce);

        translationService = initLanguageTranslatorService();
        textService = initTextToSpeechService();

        //calling methods
        translatePhrase();
        textToSpeech();
    }

    public void translatePhrase() {

        phraseArrayList = phrasesDatabase.phrases();//storing the data from the database into the array
        //array to store the string values of the main array
        ArrayList<String> phrases = new ArrayList<>();
        //loop to retrieve the values from the main array into the string array for displaying
        for(int i = 0; i < phraseArrayList.size(); i++) {
            phrases.add(phraseArrayList.get(i).getPhrase());
        }

        final ArrayAdapter<String> myAdapter = new ArrayAdapter<>(Translate.this, android.R.layout.simple_list_item_single_choice, phrases);//adapter for displaying
        list3.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = list3.getCheckedItemPosition();
                if(position > -1) {
                    translatedPhrase.setVisibility(View.VISIBLE);
                    new TranslationTask().execute(phraseArrayList.get(position).getPhrase());
                }
            }
        });

    }

    public void textToSpeech() {

        pronounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int position = list3.getCheckedItemPosition();//current position of the selected radio button
                if(position > -1) {
                    new SynthesisTask().execute(phraseArrayList.get(position).getPhrase());//translate current selected phrase
                }
            }
        });

    }

    private class TranslationTask extends AsyncTask<String, Void, String> {

        String firstTranslation;

        @Override
        protected String doInBackground(final String... params) {
            TranslateOptions translateOptions = new TranslateOptions.Builder()
                    .addText(params[0])
                    .source(Language.ENGLISH)
                    .target(/*getting the selected language from the spinner*/languageArrayList.get(subscribedLanguage.getSelectedItemPosition()).getSymbols())
                    .build();
            TranslationResult result  = translationService.translate(translateOptions).execute().getResult();
            firstTranslation = result.getTranslations().get(0).getTranslation();
            return firstTranslation;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            translatedPhrase.setText(s);//setting the textview text to the translated version
        }
    }

    private class SynthesisTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            SynthesizeOptions synthesizeOptions = new SynthesizeOptions.Builder()
                    .text(params[0])
                    .voice(SynthesizeOptions.Voice.EN_GB_KATEV3VOICE)
                    .accept(HttpMediaType.AUDIO_WAV)
                    .build();
            player.playStream(textService.synthesize(synthesizeOptions).execute().getResult());
            return "Did synthesize";
        }
    }

    private LanguageTranslator initLanguageTranslatorService() {
        Authenticator authenticator
                = new IamAuthenticator(getString(R.string.language_translator_apikey));
        LanguageTranslator service = new LanguageTranslator("2018-05-01", authenticator);
        service.setServiceUrl(getString(R.string.language_translator_url));
        return service;
    }

    private TextToSpeech initTextToSpeechService() {
        Authenticator authenticator = new IamAuthenticator(getString(R.string.text_speech_apikey));
        TextToSpeech service = new TextToSpeech(authenticator);
        service.setServiceUrl(getString(R.string.text_speech_url));
        return service;
    }
}