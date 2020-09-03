package com.example.coursework;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class Dog extends MainActivity {

    private Button next;
    private TextView answer;
    private TextView breedName;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    Random random = new Random();
    private int i = 0, j = 0, k = 0; //indexes for all three imageViews

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        next = findViewById(R.id.next);
        answer = findViewById(R.id.answer);
        breedName = findViewById(R.id.breedName);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        i = random.nextInt(50); //randomize the index
        k = random.nextInt(50);
        j = random.nextInt(50);

        breedName.setText(getBreed[0].getDogBreed());
        imageView1.setImageResource(images[i].getImage()); //sets the image to one of the images from the images array of objects with the position of the randomized index
        imageView2.setImageResource(images[j].getImage());
        imageView3.setImageResource(images[k].getImage());

        changeLevel();
        showRandomDog();
    }

    getBreed c1 = new getBreed(R.drawable.img1);
    getBreed c2 = new getBreed(R.drawable.img2);
    getBreed c3 = new getBreed(R.drawable.img3);
    getBreed c4 = new getBreed(R.drawable.img4);
    getBreed c5 = new getBreed(R.drawable.img5);
    getBreed c6 = new getBreed(R.drawable.img6);
    getBreed c7 = new getBreed(R.drawable.img7);
    getBreed c8 = new getBreed(R.drawable.img8);
    getBreed c9 = new getBreed(R.drawable.img9);
    getBreed c10 = new getBreed(R.drawable.img10);
    getBreed c11 = new getBreed(R.drawable.img11);
    getBreed c12 = new getBreed(R.drawable.img12);
    getBreed c13 = new getBreed(R.drawable.img13);
    getBreed c14 = new getBreed(R.drawable.img14);
    getBreed c15 = new getBreed(R.drawable.img15);
    getBreed c16 = new getBreed(R.drawable.img16);
    getBreed c17 = new getBreed(R.drawable.img17);
    getBreed c18 = new getBreed(R.drawable.img18);
    getBreed c19 = new getBreed(R.drawable.img19);
    getBreed c20 = new getBreed(R.drawable.img20);
    getBreed c21 = new getBreed(R.drawable.img21);
    getBreed c22 = new getBreed(R.drawable.img22);
    getBreed c23 = new getBreed(R.drawable.img23);
    getBreed c24 = new getBreed(R.drawable.img24);
    getBreed c25 = new getBreed(R.drawable.img25);
    getBreed c26 = new getBreed(R.drawable.img26);
    getBreed c27 = new getBreed(R.drawable.img27);
    getBreed c28 = new getBreed(R.drawable.img28);
    getBreed c29 = new getBreed(R.drawable.img29);
    getBreed c30 = new getBreed(R.drawable.img30);
    getBreed c31 = new getBreed(R.drawable.img31);
    getBreed c32 = new getBreed(R.drawable.img32);
    getBreed c33 = new getBreed(R.drawable.img33);
    getBreed c34 = new getBreed(R.drawable.img34);
    getBreed c35 = new getBreed(R.drawable.img35);
    getBreed c36 = new getBreed(R.drawable.img36);
    getBreed c37 = new getBreed(R.drawable.img37);
    getBreed c38 = new getBreed(R.drawable.img38);
    getBreed c39 = new getBreed(R.drawable.img39);
    getBreed c40 = new getBreed(R.drawable.img40);
    getBreed c41 = new getBreed(R.drawable.img41);
    getBreed c42 = new getBreed(R.drawable.img42);
    getBreed c43 = new getBreed(R.drawable.img43);
    getBreed c44 = new getBreed(R.drawable.img44);
    getBreed c45 = new getBreed(R.drawable.img45);
    getBreed c46 = new getBreed(R.drawable.img46);
    getBreed c47 = new getBreed(R.drawable.img47);
    getBreed c48 = new getBreed(R.drawable.img48);
    getBreed c49 = new getBreed(R.drawable.img490);
    getBreed c50 = new getBreed(R.drawable.img50);

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

    //arrays of objects for each breed with duplicated items to match the main array's length
    final getBreed[] boston = new getBreed[] {b1, b1, b1, b1, b1, b1, b1, b1, b1, b1, b2, b2, b2, b2, b2, b2, b2, b2, b2, b2, b3, b3, b3, b3, b3, b3, b3, b3, b3, b3,
            b4, b4, b4, b4, b4, b4, b4, b4, b4, b4, b5, b5, b5, b5, b5, b5, b5, b5, b5, b5};
    final getBreed[] beagle = new getBreed[] {b6, b6, b6, b6, b6, b6, b6, b6, b6, b6, b7, b7, b7, b7, b7, b7, b7, b7, b7, b7, b8, b8, b8, b8, b8, b8, b8, b8, b8, b8,
            b9, b9, b9, b9, b9, b9, b9, b9, b9, b9, b10, b10, b10, b10, b10, b10, b10, b10, b10, b10};
    final getBreed[] chihuahua = new getBreed[] {b11, b11, b11, b11, b11, b11, b11, b11, b11, b11, b11, b12, b12, b12, b12, b12, b12, b12, b12, b12, b13, b13, b13, b13, b13, b13, b13, b13, b13, b13,
            b14, b14, b14, b14, b14, b14, b14, b14, b14, b14, b15, b15, b15, b15, b15, b15, b15, b15, b15, b15};
    final getBreed[] doberman = new getBreed[] {b16, b16, b16, b16, b16, b16, b16, b16, b16, b16, b16, b17, b17, b17, b17, b17, b17, b17, b17, b17, b18, b18, b18, b18, b18, b18, b18, b18, b18, b18,
            b19, b19, b19, b19, b19, b19, b19, b19, b19, b19, b20, b20, b20, b20, b20, b20, b20, b20, b20, b20};
    final getBreed[] labrador = new getBreed[] {b21, b21, b21, b21, b21, b21, b21, b21, b21, b21, b21, b22, b22, b22, b22, b22, b22, b22, b22, b22, b23, b23, b23, b23, b23, b23, b23, b23, b23, b23,
            b24, b24, b24, b24, b24, b24, b24, b24, b24, b24, b25, b25, b25, b25, b25, b25, b25, b25, b25, b25};
    final getBreed[] maltese = new getBreed[] {b26, b26, b26, b26, b26, b26, b26, b26, b26, b26, b26, b27, b27, b27, b27, b27, b27, b27, b27, b27, b28, b28, b28, b28, b28, b28, b28, b28, b28, b28,
            b29, b29, b29, b29, b29, b29, b29, b29, b29, b29, b30, b30, b30, b30, b30, b30, b30, b30, b30, b30};
    final getBreed[] pomeranian = new getBreed[] {b31, b31, b31, b31, b31, b31, b31, b31, b31, b31, b31, b32, b32, b32, b32, b32, b32, b32, b32, b32, b33, b33, b33, b33, b33, b33, b33, b33, b33, b33,
            b34, b34, b34, b34, b34, b34, b34, b34, b34, b34, b35, b35, b35, b35, b35, b35, b35, b35, b35, b35};
    final getBreed[] pug = new getBreed[] {b36, b36, b36, b36, b36, b36, b36, b36, b36, b36, b36, b37, b37, b37, b37, b37, b37, b37, b37, b37, b38, b38, b38, b38, b38, b38, b38, b38, b38, b38,
            b39, b39, b39, b39, b39, b39, b39, b39, b39, b39, b40, b40, b40, b40, b40, b40, b40, b40, b40, b40};
    final getBreed[] husky = new getBreed[] {b41, b41, b41, b41, b41, b41, b41, b41, b41, b41, b41, b42, b42, b42, b42, b42, b42, b42, b42, b42, b43, b43, b43, b43, b43, b43, b43, b43, b43, b43,
            b44, b44, b44, b44, b44, b44, b44, b44, b44, b44, b45, b45, b45, b45, b45, b45, b45, b45, b45, b45};
    final getBreed[] toy = new getBreed[] {b46, b46, b46, b46, b46, b46, b46, b46, b46, b46, b46, b47, b47, b47, b47, b47, b47, b47, b47, b47, b48, b48, b48, b48, b48, b48, b48, b48, b48, b48,
            b49, b49, b49, b49, b49, b49, b49, b49, b49, b49, b50, b50, b50, b50, b50, b50, b50, b50, b50, b50};

    final getBreed[] getBreed = new getBreed[] {
            b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32,
            b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50}; //main array of objects

    final getBreed[] images = new getBreed[] { c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27,
            c28, c29, c30, c31, c32, c33, c34, c35, c36, c37, c38, c39, c40, c41, c42, c43, c44, c45, c46, c47, c48, c49, c50}; //array of objects for images

    public void showRandomDog() {

        //checks for the indexes to not have the same value in order to display different images
        if(i == j || i == k) {
            i = random.nextInt(50);
            imageView1.setImageResource(images[i].getImage());
        }

        if(j == i || j == k) {
            j = random.nextInt(50);
            imageView2.setImageResource(images[j].getImage());
        }

        if(k == i || k == j) {
            k = random.nextInt(50);
            imageView3.setImageResource(images[k].getImage());
        }

        //links the name of the breed to one of the images
        if(breedName.getText().toString().equals(boston[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(boston[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(boston[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(beagle[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(beagle[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(beagle[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(chihuahua[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(chihuahua[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(chihuahua[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(doberman[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(doberman[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(doberman[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(labrador[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(labrador[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(labrador[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(maltese[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(maltese[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(maltese[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(pomeranian[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(pomeranian[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(pomeranian[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(pug[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(pug[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(pug[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(husky[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(husky[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(husky[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        if(breedName.getText().toString().equals(toy[i].getDogBreed())) {
            breedName.setText(getBreed[i].getDogBreed());
        }
        if(breedName.getText().toString().equals(toy[j].getDogBreed())) {
            breedName.setText(getBreed[j].getDogBreed());
        }
        if(breedName.getText().toString().equals(toy[k].getDogBreed())) {
            breedName.setText(getBreed[k].getDogBreed());
        }

        //checks for images to not show the same breed
        if(boston[i].getImage() == boston[j].getImage() || boston[i].getImage() == boston[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(boston[j].getImage() == boston[i].getImage() || boston[j].getImage() == boston[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(boston[k].getImage() == boston[i].getImage() || boston[k].getImage() == boston[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(beagle[i].getImage() == beagle[j].getImage() || beagle[i].getImage() == beagle[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(beagle[j].getImage() == beagle[i].getImage() || beagle[j].getImage() == beagle[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(beagle[k].getImage() == beagle[i].getImage() || beagle[k].getImage() == beagle[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(chihuahua[i].getImage() == chihuahua[j].getImage() || chihuahua[i].getImage() == chihuahua[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(chihuahua[j].getImage() == chihuahua[i].getImage() || chihuahua[j].getImage() == chihuahua[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(chihuahua[k].getImage() == chihuahua[i].getImage() || chihuahua[k].getImage() == chihuahua[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(doberman[i].getImage() == doberman[j].getImage() || doberman[i].getImage() == doberman[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(doberman[j].getImage() == doberman[i].getImage() || doberman[j].getImage() == doberman[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(doberman[k].getImage() == doberman[i].getImage() || doberman[k].getImage() == doberman[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(labrador[i].getImage() == labrador[j].getImage() || labrador[i].getImage() == labrador[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(labrador[j].getImage() == labrador[i].getImage() || labrador[j].getImage() == labrador[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(labrador[k].getImage() == labrador[i].getImage() || labrador[k].getImage() == labrador[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(maltese[i].getImage() == maltese[j].getImage() || maltese[i].getImage() == maltese[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(maltese[j].getImage() == maltese[i].getImage() || maltese[j].getImage() == maltese[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(maltese[k].getImage() == maltese[i].getImage() || maltese[k].getImage() == maltese[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(pomeranian[i].getImage() == pomeranian[j].getImage() || pomeranian[i].getImage() == pomeranian[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(pomeranian[j].getImage() == pomeranian[i].getImage() || pomeranian[j].getImage() == pomeranian[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(pomeranian[k].getImage() == pomeranian[i].getImage() || pomeranian[k].getImage() == pomeranian[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(pug[i].getImage() == pug[j].getImage() || pug[i].getImage() == pug[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(pug[j].getImage() == pug[i].getImage() || pug[j].getImage() == pug[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(pug[k].getImage() == pug[i].getImage() || pug[k].getImage() == pug[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(husky[i].getImage() == husky[j].getImage() || husky[i].getImage() == husky[k].getImage()) {i = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(husky[j].getImage() == husky[i].getImage() || husky[j].getImage() == husky[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(husky[k].getImage() == husky[i].getImage() || husky[k].getImage() == husky[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        if(toy[i].getImage() == toy[j].getImage() || toy[i].getImage() == toy[k].getImage()) {k = random.nextInt(50); imageView1.setImageResource(images[i].getImage());}
        if(toy[j].getImage() == toy[i].getImage() || toy[j].getImage() == toy[k].getImage()) {j = random.nextInt(50); imageView2.setImageResource(images[j].getImage());}
        if(toy[k].getImage() == toy[i].getImage() || toy[k].getImage() == toy[j].getImage()) {k = random.nextInt(50); imageView3.setImageResource(images[k].getImage());}

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(breedName.getText().toString().equals(getBreed[i].getDogBreed())) {
                    next.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.VISIBLE);
                    answer.setBackgroundColor(Color.parseColor("#26c952"));
                    answer.setText(R.string.rightAnswer);
                } else {
                    next.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.VISIBLE);
                    answer.setBackgroundColor(Color.parseColor("#c92626"));
                    answer.setText(R.string.wrongAnswer);
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(breedName.getText().toString().equals(getBreed[j].getDogBreed())) {
                    next.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.VISIBLE);
                    answer.setBackgroundColor(Color.parseColor("#26c952"));
                    answer.setText(R.string.rightAnswer);
                } else {
                    next.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.VISIBLE);
                    answer.setBackgroundColor(Color.parseColor("#c92626"));
                    answer.setText(R.string.wrongAnswer);
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(breedName.getText().toString().equals(getBreed[k].getDogBreed())) {
                    next.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.VISIBLE);
                    answer.setBackgroundColor(Color.parseColor("#26c952"));
                    answer.setText(R.string.rightAnswer);
                } else {
                    next.setVisibility(View.VISIBLE);
                    answer.setVisibility(View.VISIBLE);
                    answer.setBackgroundColor(Color.parseColor("#c92626"));
                    answer.setText(R.string.wrongAnswer);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                recreate();
            }
        });
    }
}
