package com.example.investmentapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import java.util.List;

public class FilteredOptions extends Activity {

    List<Investment_options> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_products);

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

        //creating recyclerview adapter
        //ProductAdapter adapter = new (this, productList);

        //setting adapter to recyclerview
       // recyclerView.setAdapter(adapter);
    }

    public List<Investment_options> getProductList() {
        return productList;
    }
}

