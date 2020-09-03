package com.example.languagetranslatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

//class for displaying the languages that the user subscribed or can subscribe to
public class LanguageSubscription extends MainActivity {
    ArrayList<Language> languageArrayList = new ArrayList<>(); //array for the stored values
    private ListView list; //the listview in which we're displaying the layout
    private Button updateSubscription;
    private ArrayAdapter<String> myAdapter; //adapter for displaying
    final ArrayList<String> languages = new ArrayList<>(); //array to store the string values of the main array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);

        list = findViewById(R.id.list2);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE); //setting the choice mode of the list to multiple choice
        updateSubscription = findViewById(R.id.updateSubscription);

        //calling methods
        selectSubscription();
        updateSubscription();
    }

    public void selectSubscription() {

        languageArrayList = phrasesDatabase.languages();//storing the data from the database into the array

        //loop to retrieve the values from the main array into the string array for displaying
        for(int i = 0; i < languageArrayList.size(); i++) {
            languages.add(languageArrayList.get(i).getLanguage());
        }
        myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, languages);
        list.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();//notify for changes

        updateSubscription.setClickable(false);//setting button to inactive
    }

    public void updateSubscription() {

        updateSubscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = list.getCheckedItemPosition();//checks the current selecte item/s
                for(int i = 0; i < languageArrayList.size(); i++) {
                    if(position > -1) {

                        //display messages
                        Toast.makeText(LanguageSubscription.this,"Subscribed",Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(LanguageSubscription.this,"Not Subscribed",Toast.LENGTH_LONG).show();
                    }
                }
                myAdapter.notifyDataSetChanged();

                }
        });
    }
}
