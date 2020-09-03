package com.example.coursework;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;

public class Breed extends MainActivity {

    private int counter = 0; //counts button clicks
    private Button submit;
    private TextView answer; //displays correct or wrong after button click
    private TextView breedName; //displays the breed name after button click
    private ImageView imageView;
    private Spinner dogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed);

        submit = findViewById(R.id.submit);
        answer = findViewById(R.id.answer);
        breedName = findViewById(R.id.breedName);
        imageView = findViewById(R.id.imageView);
        dogList = findViewById(R.id.dogsList);

        //when one of the spinner items is selected displays the answer only after the button is clicked
        dogList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(dogList.getSelectedItem().toString().equals(getBreed[0].getDogBreed())) {

                    answer.setBackgroundColor(Color.parseColor("#26c952"));
                    answer.setText(R.string.rightAnswer);
                } else {

                    answer.setBackgroundColor(Color.parseColor("#c92626"));
                    answer.setText(R.string.wrongAnswer);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        changeLevel(); //calls hard mode method
        showRandomBreed();
    }

    getBreed b1 = new getBreed("Boston Bull", R.drawable.img1);
    getBreed b2 = new getBreed("Boston Bull", R.drawable.img2);
    getBreed b3 = new getBreed("Boston Bull", R.drawable.img3);
    getBreed b4 = new getBreed("Boston Bull", R.drawable.img4);
    getBreed b5 = new getBreed("Boston Bull", R.drawable.img5);
    getBreed b6 = new getBreed("Beagle", R.drawable.img6);
    getBreed b7 = new getBreed("Beagle", R.drawable.img7);
    getBreed b8 = new getBreed("Beagle", R.drawable.img8);
    getBreed b9 = new getBreed("Beagle", R.drawable.img9);
    getBreed b10 = new getBreed("Beagle", R.drawable.img10);
    getBreed b11 = new getBreed("Chihuahua", R.drawable.img11);
    getBreed b12 = new getBreed("Chihuahua", R.drawable.img12);
    getBreed b13 = new getBreed("Chihuahua", R.drawable.img13);
    getBreed b14 = new getBreed("Chihuahua", R.drawable.img14);
    getBreed b15 = new getBreed("Chihuahua", R.drawable.img15);
    getBreed b16 = new getBreed("Doberman", R.drawable.img16);
    getBreed b17 = new getBreed("Doberman", R.drawable.img17);
    getBreed b18 = new getBreed("Doberman", R.drawable.img18);
    getBreed b19 = new getBreed("Doberman", R.drawable.img19);
    getBreed b20 = new getBreed("Doberman", R.drawable.img20);
    getBreed b21 = new getBreed("Labrador Retriever", R.drawable.img21);
    getBreed b22 = new getBreed("Labrador Retriever", R.drawable.img22);
    getBreed b23 = new getBreed("Labrador Retriever", R.drawable.img23);
    getBreed b24 = new getBreed("Labrador Retriever", R.drawable.img24);
    getBreed b25 = new getBreed("Labrador Retriever", R.drawable.img25);
    getBreed b26 = new getBreed("Maltese", R.drawable.img26);
    getBreed b27 = new getBreed("Maltese", R.drawable.img27);
    getBreed b28 = new getBreed("Maltese", R.drawable.img28);
    getBreed b29 = new getBreed("Maltese", R.drawable.img29);
    getBreed b30 = new getBreed("Maltese", R.drawable.img30);
    getBreed b31 = new getBreed("Pomeranian", R.drawable.img31);
    getBreed b32 = new getBreed("Pomeranian", R.drawable.img32);
    getBreed b33 = new getBreed("Pomeranian", R.drawable.img33);
    getBreed b34 = new getBreed("Pomeranian", R.drawable.img34);
    getBreed b35 = new getBreed("Pomeranian", R.drawable.img35);
    getBreed b36 = new getBreed("Pug", R.drawable.img36);
    getBreed b37 = new getBreed("Pug", R.drawable.img37);
    getBreed b38 = new getBreed("Pug", R.drawable.img38);
    getBreed b39 = new getBreed("Pug", R.drawable.img39);
    getBreed b40 = new getBreed("Pug", R.drawable.img40);
    getBreed b41 = new getBreed("Siberian Husky", R.drawable.img41);
    getBreed b42 = new getBreed("Siberian Husky", R.drawable.img42);
    getBreed b43 = new getBreed("Siberian Husky", R.drawable.img43);
    getBreed b44 = new getBreed("Siberian Husky", R.drawable.img44);
    getBreed b45 = new getBreed("Siberian Husky", R.drawable.img45);
    getBreed b46 = new getBreed("Toy Terrier", R.drawable.img46);
    getBreed b47 = new getBreed("Toy Terrier", R.drawable.img47);
    getBreed b48 = new getBreed("Toy Terrier", R.drawable.img48);
    getBreed b49 = new getBreed("Toy Terrier", R.drawable.img490);
    getBreed b50 = new getBreed("Toy Terrier", R.drawable.img50);

    final getBreed[] getBreed = new getBreed[] {
            b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32,
            b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50}; //array of objects for the breeds and their images

    public void showRandomBreed() {
        shuffleBreeds(); //shuffles the array of objects getBreed
        imageView.setImageResource(getBreed[0].getImage()); //sets the imageView to the value obtained from the class getBreed
        breedName.setText(getBreed[0].getDogBreed()); //sets the breedName to the value obtained from the class getBreed

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                counter++;

                Runnable runn = new Runnable() {
                    @Override
                    public void run() {
                        counter = 0;
                    }
                };

                if(counter == 1) {

                    submit.setText(R.string.next);
                    answer.setVisibility(View.VISIBLE);
                    breedName.setVisibility(View.VISIBLE);
                    dogList.setVisibility(View.INVISIBLE);
                }
                else if(counter == 2) {
                    recreate(); //restarts the activity
                }
            }
        });
    }

    public void shuffleBreeds() {Collections.shuffle(Arrays.asList(getBreed));}
}
