package com.example.investmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Classify classify = new Classify();
    double score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        classify.generate();

        // generates the normalised age and income
        Imputation input = new Imputation(100000, 25);

        // calculate the score from the above data
        score = input.getScore();


    }
}
