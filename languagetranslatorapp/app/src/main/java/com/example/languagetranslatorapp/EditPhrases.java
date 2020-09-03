package com.example.languagetranslatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

//class to edit data in the database
public class EditPhrases extends MainActivity {
    private Button edit;
    private Button update;
    private EditText updatePhrase;
    private ListView savedPhrases;
    ArrayList<Phrase> phraseArrayList;//array for the stored values

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        edit = findViewById(R.id.edit);
        update = findViewById(R.id.update);
        updatePhrase = findViewById(R.id.updatePhrase);
        savedPhrases = findViewById(R.id.savedPhrases);//the listview in which we're displaying the layout
        savedPhrases.setChoiceMode(ListView.CHOICE_MODE_SINGLE);//setting the choice mode of the list to single choice

        //calling methods
        editPhrases();
    }

    public void editPhrases() {

        phraseArrayList = phrasesDatabase.phrases();//storing the data from the database into the array
        final ArrayList<String> phrases = new ArrayList<>();//array to store the string values of the main array
        //loop to retrieve the values from the main array into the string array for displaying
        for(int i = 0; i < phraseArrayList.size(); i++) {
            phrases.add(phraseArrayList.get(i).getPhrase());
        }

        final ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, phrases);//adapter for displaying
        savedPhrases.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();//notify for changes

        updatePhrase.setVisibility(View.INVISIBLE);
        update.setVisibility(View.INVISIBLE);


        edit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        updatePhrase.setVisibility(View.VISIBLE);
                        update.setVisibility(View.VISIBLE);
                        edit.setClickable(false);
                    }
                }
        );

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                update.setVisibility(View.INVISIBLE);
                edit.setClickable(true);
                updatePhrase.setVisibility(View.INVISIBLE);

                int position = savedPhrases.getCheckedItemPosition();//current position of the selected radio button
                if(position > -1) {

                    phrasesDatabase.deleteData(phraseArrayList.get(position).getPhrase());//delete selected data
                    myAdapter.remove(phraseArrayList.get(position).getPhrase());//remove from the view
                    phrasesDatabase.insertData(updatePhrase.getText().toString());//insert new data from the edit text
                    myAdapter.add(updatePhrase.getText().toString());//add to view
                    phrasesDatabase.updateData(updatePhrase.getText().toString());//update the database with the new value
                    myAdapter.notifyDataSetChanged();//notify for changes

                    //display messages
                    Toast.makeText(EditPhrases.this, "Modified", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(EditPhrases.this, "Not Modified", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
