package com.example.coursework;

class getBreed {

    private String dogBreeds;
    private int images;

    getBreed(String dogBreeds, int images) {

        this.dogBreeds = dogBreeds;
        this.images = images;
    }

    getBreed(String dogBreeds) {
        this.dogBreeds = dogBreeds;
    }

    getBreed(int images) {
        this.images = images;
    }

    String getDogBreed() {
        return dogBreeds;
    }

    int getImage() {
        return images;
    }

}
