package com.example.investmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class PersonalProfile extends AppCompatActivity {

    Button btn ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal2);

        btn = (Button) findViewById(R.id.btnExplore);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalProfile.this,FilteredOptions.class);
                startActivity(intent);
            }
        });


    }
}
