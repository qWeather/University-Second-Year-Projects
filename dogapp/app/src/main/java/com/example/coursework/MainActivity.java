package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{

    private Switch hardMode; //switch to hard mode
    private Button identifyBreed;
    private Button identifyDog;
    private long timeLeft = 10000; //time for hard mode

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hardMode = findViewById(R.id.hardMode);
        identifyBreed = findViewById(R.id.identifyBreed);
        identifyDog = findViewById(R.id.identifyDog);

        changeLevel(); //hard mode method
    }

    public void changeLevel() {

        hardMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    identifyBreed.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent intent = new Intent(MainActivity.this, Breed.class); //go to hard mode level
                            startActivity(intent);

                            new CountDownTimer(timeLeft, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }
                                @Override
                                public void onFinish() {
                                    System.out.println("Time's out!");
                                }
                            }.start();
                        }
                    });

                    identifyDog.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent intent2 = new Intent(MainActivity.this, Dog.class); //go to hard mode level
                            startActivity(intent2);

                            new CountDownTimer(timeLeft, 1000) {
                                @Override
                                public void onTick(long millisUntilFinished) {
                                }
                                @Override
                                public void onFinish() {
                                    System.out.println("Time's out!");
                                }
                            }.start();
                        }
                    });

                    identifyBreed.setBackgroundColor(Color.parseColor("#c92626")); //change button color to specified colour while in hard mode
                    identifyDog.setBackgroundColor(Color.parseColor("#c92626")); //change button color to specified colour while in hard mode
                } else {
                    identifyBreed.setBackgroundColor(Color.parseColor("#6200EE")); //chang button color back to initial colour when hard mode off
                    identifyDog.setBackgroundColor(Color.parseColor("#6200EE")); //chang button color back to initial colour when hard mode off
                }
            }
        });
    }

    //methods to go to other activities through button click
    public void nextPage1(View view) {

        Intent intent1 = new Intent(this, Breed.class);
        startActivity(intent1);
    }

    public void nextPage2(View view) {

        Intent intent2 = new Intent(this, Dog.class);
        startActivity(intent2);
    }

    public void nextPage3(View view) {

        Intent intent3 = new Intent(this, Search.class);
        startActivity(intent3);
    }
}
