package com.example.two;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Places extends AppCompatActivity {

    ImageView img;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        Toolbar mToolbar = findViewById(R.id.ptoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Places");



        img = (ImageView) findViewById(R.id.one);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Places.this, Detail.class);
                mainIntent.putExtra("position", "one");
                startActivity(mainIntent);
            }
        });

        img = (ImageView) findViewById(R.id.two);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Places.this, Detail.class);
                mainIntent.putExtra("position", "two");
                startActivity(mainIntent);
            }
        });

        img = (ImageView) findViewById(R.id.three);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Places.this, Detail.class);
                mainIntent.putExtra("position", "three");
                startActivity(mainIntent);
            }
        });
        img = (ImageView) findViewById(R.id.four);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Places.this, Detail.class);
                mainIntent.putExtra("position", "four");
                startActivity(mainIntent);
            }
        });
        img = (ImageView) findViewById(R.id.five);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Places.this, Detail.class);
                mainIntent.putExtra("position", "five");
                startActivity(mainIntent);
            }
        });
        img = (ImageView) findViewById(R.id.six);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Places.this, Detail.class);
                mainIntent.putExtra("position", "six");
                startActivity(mainIntent);
            }
        });


    }


}

