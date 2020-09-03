package com.example.languagetranslatorapp;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

//class to display the data from the sql table
public class DisplayPhrases extends MainActivity {

    ArrayList<Phrase> phraseArrayList; //array for the stored values
    private ListView savedPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        savedPhrases = findViewById(R.id.savedPhrases); //the listview in which we're displaying the custom layout

        //calling method
        displayPhrases();
    }

    public void displayPhrases() {

        phraseArrayList = phrasesDatabase.phrases(); //storing the data from the database into the array
        Adapter myAdapter = new Adapter(this, phraseArrayList); //calling the adapter from the adapter class
        savedPhrases.setAdapter(myAdapter); //setting the listview to the adapter
        myAdapter.notifyDataSetChanged(); //notify for changes
    }
}
