package com.example.coursework;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Collections;

public class Search extends MainActivity {

    private Button submit;
    private Button stop;
    private EditText dogName; //field to input the dog breed
    private ImageView imageView4;
    private CountDownTimer timer; //timer to change the image after 5 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        submit = findViewById(R.id.submit);
        stop = findViewById(R.id.stop);
        dogName = findViewById(R.id.dogName);
        imageView4 = findViewById(R.id.imageView4);

        showBreedImages();

    }

    getBreed d1 = new getBreed("Boston Bull");
    getBreed d2 = new getBreed("Beagle");
    getBreed d3 = new getBreed("Chihuahua");
    getBreed d4 = new getBreed("Doberman");
    getBreed d5 = new getBreed("Labrador Retriever");
    getBreed d6 = new getBreed("Maltese");
    getBreed d7 = new getBreed("Pomeranian");
    getBreed d8 = new getBreed("Pug");
    getBreed d9 = new getBreed("Siberian Husky");
    getBreed d10 = new getBreed("Toy Terrier");

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

    //arrays of objects for each breed
    final getBreed[] boston = new getBreed[] {b1, b2, b3, b4, b5};
    final getBreed[] beagle = new getBreed[] {b6, b7, b8, b9, b10};
    final getBreed[] chihuahua = new getBreed[] {b11, b12, b13, b14, b15};
    final getBreed[] doberman = new getBreed[] {b16, b17, b18, b19, b20};
    final getBreed[] labrador = new getBreed[] {b21, b22, b23, b24, b25};
    final getBreed[] maltese = new getBreed[] {b26, b27, b28, b29, b30};
    final getBreed[] pomeranian = new getBreed[] {b31, b32, b33, b34, b35};
    final getBreed[] pug = new getBreed[] {b36, b37, b38, b39, b40};
    final getBreed[] husky = new getBreed[] {b41, b42, b43, b44, b45};
    final getBreed[] toy = new getBreed[] {b46, b47, b48, b49, b50};

    final getBreed[] dogs = new getBreed[] {d1, d2, d3, d4, d5, d6, d7, d8, d9, d10}; //array of objects for the breeds

    public void showBreedImages() {

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogName.setFocusable(false); //deactivates the EditText field so the user won't be able to input anything until the button stop is clicked
                stop.setVisibility(View.VISIBLE);
                submit.setVisibility(View.INVISIBLE);
                timer = new CountDownTimer(5000, 5000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        //searches for the name inputted in the EditText field in the array of breeds and matches it to a breed so it can display a slideshow of images
                        if(dogName.getText().toString().equals(dogs[0].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(boston));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(boston[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[1].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(beagle));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(beagle[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[2].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(chihuahua));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(chihuahua[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[3].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(doberman));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(doberman[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[4].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(labrador));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(labrador[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[5].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(maltese));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(maltese[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[6].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(pomeranian));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(pomeranian[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[7].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(pug));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(pug[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[8].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(husky));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(husky[0].getImage());
                        } else if(dogName.getText().toString().equals(dogs[9].getDogBreed())) {
                            Collections.shuffle(Arrays.asList(toy));
                            imageView4.setVisibility(View.VISIBLE);
                            imageView4.setImageResource(toy[0].getImage());
                        } else {
                            imageView4.setVisibility(View.INVISIBLE);
                            System.out.println("Enter a breed!");
                        }
                    }
                    @Override
                    public void onFinish() {
                        start();
                    } //loops the CountdownTimer
                }.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogName.setFocusableInTouchMode(true); //restores initial state of the EditText so user can give input again
                submit.setVisibility(View.VISIBLE);
                stop.setVisibility(View.INVISIBLE);
                timer.cancel(); //stops the timer and the slideshow with it
            }
        });
    }
}
