package com.example.languagetranslatorapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//database adapter
public class Database extends SQLiteOpenHelper {

    //initializing database and tables with columns
    private static final String DATABASE_NAME = "Translator.db";
    private static final String TABLE_NAME = "phrases_table";
    private static final String TABLE_NAME2 = "languages_table";
    private static final String COL_2 = "phrases";
    private static final String COL_3 = "languages";
    private static final String COL_4 = "symbols";

    Database(Context context) {
        super(context, DATABASE_NAME, null, 2);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creating tables
        db.execSQL("create table " + TABLE_NAME +" ( phrases TEXT) ");
        db.execSQL("create table " + TABLE_NAME2 +" (languages TEXT, symbols TEXT)");
        db.execSQL("insert into " + TABLE_NAME2 + "(languages, symbols) VALUES('Arabic', 'ar'), ('Bulgarian', 'bg'), ('Croatian', 'hr'), ('French', 'fr'), ('German', 'de'), ('Hungarian', 'hu'), ('Italian', 'it'), ('Polish', 'pl'), ('Romanian', 'ro'), ('Turkish', 'tr')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
    }

    //method to add data to the table
    boolean insertData(String phrases) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, phrases);
        long result = db.insert(TABLE_NAME,null, contentValues);
        return result != -1;
    }

    //method to update the current state of the data in the table
    boolean updateData(String phrases) {
        String where = COL_2 + " = ?";
        String[] whereArgs = { String.valueOf(phrases) };
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, phrases);
        db.update(TABLE_NAME, contentValues, where, whereArgs);
        return true;
    }

    //method to delete data from the table
     Integer deleteData (String phrases) {
        SQLiteDatabase db = this.getWritableDatabase();
        String where = COL_2 + " = ?";
        String[] whereArgs = { String.valueOf(phrases) };
        return db.delete(TABLE_NAME, where, whereArgs);
    }

    //method to store and display the added data into an array
    public ArrayList<Phrase> phrases() {
        ArrayList<Phrase> phraseArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM phrases_table", null);

        while(cursor.moveToNext()) {

            String phrases = cursor.getString(0);

            Phrase phrase = new Phrase(phrases);

            phraseArrayList.add(phrase);
            Collections.sort(phraseArrayList, new Comparator<Phrase>() {
                @Override
                public int compare(Phrase o1, Phrase o2) {
                    return o1.getPhrase().compareTo(o2.getPhrase());
                }
            });
        }
        return phraseArrayList;
    }

    //method to store and display the added data into an array
    public ArrayList<Language> languages() {
        ArrayList<Language> languageArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM languages_table", null);

        while(cursor.moveToNext()) {

            String languages = cursor.getString(0);
            String symbols = cursor.getString(1);

            Language language = new Language(languages, symbols);

            languageArrayList.add(language);
        }
        return languageArrayList;
    }
}