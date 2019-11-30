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
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        45,
                        60000,
                        R.drawable.house));

        productList.add
                (
                        new Investment_options(
                                1,
                                "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                                "14 inch, Gray, 1.659 kg",
                                78,
                                60000,
                                R.drawable.house)
                );

        productList.add(
                new Investment_options(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        86,
                        60000,
                        R.drawable.house));


        // update the order of the product lists based on the score
        updatedList = ob.generateNewList(productList, score);

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, updatedList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }


}

