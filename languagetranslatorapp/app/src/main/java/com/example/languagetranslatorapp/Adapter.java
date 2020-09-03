package com.example.languagetranslatorapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

//adapter class for displaying
public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<Phrase> phrasesArray;

    //constructor for adapter that returns the view and the values from the array
    Adapter(Context context, ArrayList<Phrase> phrasesArray) {
        this.context = context;
        this.phrasesArray = phrasesArray;
    }

    @Override
    public int getCount() {
        return this.phrasesArray.size();
    }

    @Override
    public Object getItem(int position) {
        return phrasesArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        convertView = inflater.inflate(R.layout.activity_custom, null); //setting the view to the custom layout
        TextView phrases = convertView.findViewById(R.id.PHRASES); //getting the textview from the custom layout
        Phrase phrase = phrasesArray.get(position);

        phrases.setText(phrase.getPhrase());

        return convertView;
    }

}
