package com.example.languagetranslatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Class to add data into sql
public class AddPhrases extends MainActivity {
    private Button save;
    private EditText enterPhrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        save = findViewById(R.id.save);
        enterPhrase = findViewById(R.id.enterPhrase);

        //calling method
        addPhrase();
    }

    public  void addPhrase() {
        //on save button click add data to sql table
        save.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //check to see if value was added from the edit text and then pass the value to the database
                        boolean isAdded = phrasesDatabase.insertData(enterPhrase.getText().toString());
                        enterPhrase.getText().clear();
                        //displaying messages
                        if(isAdded)
                            Toast.makeText(AddPhrases.this,"Added",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(AddPhrases.this,"Not Added",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}

