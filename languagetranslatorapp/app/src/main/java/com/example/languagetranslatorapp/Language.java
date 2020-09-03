package com.example.languagetranslatorapp;

//Language class to get data
class Language {
    private String language;
    private String symbol;

    Language(String language, String symbol) {
        this.language = language;
        this.symbol = symbol;
    }


    public String getLanguage() {
        return language;
    }

    public String getSymbols() {
        return symbol;
    }
}
