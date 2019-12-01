package com.example.investmentapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import java.util.List;

public class FilteredOptions extends Activity {

    List<Investment_options> productList;
    List<Investment_options> updatedList;
    Investments ob = new Investments();
    double score;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtered_options);

        // generates the normalised age and income (currently hard coded)
        Imputation input = new Imputation(100000, 25);

        // calculate the score from the above data (logic coded)
        score = input.getScore();

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Investment_options(
                        1,
                        "Tesla",
                        "Invest in the future of tech",
                        45,
                        330,
                        R.drawable.tesla));

        productList.add
                (
                        new Investment_options(
                                1,
                                "Facebook Stock",
                                "We are bieng replaced by Instagram :p",
                                65,
                                199.4,
                                R.drawable.face)
                );

        productList.add(
                new Investment_options(
                        1,
                        "24 Carat Gold",
                        "Excellent quality, great investment ",
                        75,
                        1250,
                        R.drawable.gold));

        //adding some items to our list
        productList.add(
                new Investment_options(
                        1,
                        "Villa ",
                        "5 Bed, 3 baths....",
                        80,
                        500000,
                        R.drawable.house));


        // update the order of the product lists based on the score
        updatedList = ob.generateNewList(productList, score);

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, updatedList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }


}

