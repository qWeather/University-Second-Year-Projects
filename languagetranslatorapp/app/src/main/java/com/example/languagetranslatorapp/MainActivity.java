package com.example.languagetranslatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Database phrasesDatabase; //calling the database

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phrasesDatabase = new Database(this); //initializing the database
    }

    //intents for the buttons in the main layout to switch between activities
    public void nextPage(View view) {
        Intent one = new Intent(this, AddPhrases.class);
        startActivity(one);
    }

    public void nextPage1(View view) {
        Intent two = new Intent(this, DisplayPhrases.class);
        startActivity(two);
    }

    public void nextPage2(View view) {
        Intent three = new Intent(this, EditPhrases.class);
        startActivity(three);
    }

    public void nextPage3(View view) {
        Intent four = new Intent(this, LanguageSubscription.class);
        startActivity(four);
    }

    public void nextPage4(View view) {
        Intent five = new Intent(this, Translate.class);
        startActivity(five);
    }
}

