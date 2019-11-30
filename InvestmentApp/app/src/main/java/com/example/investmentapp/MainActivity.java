package com.example.investmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    FilteredOptions obj = new FilteredOptions();
    Investments ob = new Investments();
    List<Investment_options> productList;
    List<Investment_options> updatedList;
    double score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // generates the normalised age and income (currently hard coded)
        Imputation input = new Imputation(100000, 25);

        // calculate the score from the above data (logic coded)
        score = input.getScore();

        // dummy products generation
        productList = obj.getProductList();

        // update the order of the product lists based on the score
        updatedList = ob.generateNewList(productList, score);


    }
}
