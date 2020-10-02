package com.example.two;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Adventures extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventures);

        Toolbar mToolbar = findViewById(R.id.ptoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Adventures");

                img=(ImageView) findViewById(R.id.one1);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Adventures.this, Detail.class);
                mainIntent.putExtra("position", "one");
                startActivity(mainIntent);
            }
        });

        img = (ImageView) findViewById(R.id.two2);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Adventures.this, Detail.class);
                mainIntent.putExtra("position", "two");
                startActivity(mainIntent);
            }
        });

        img = (ImageView) findViewById(R.id.three3);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Adventures.this, Detail.class);
                mainIntent.putExtra("position", "three");
                startActivity(mainIntent);
            }
        });
        img = (ImageView) findViewById(R.id.four4);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Adventures.this, Detail.class);
                mainIntent.putExtra("position", "four");
                startActivity(mainIntent);
            }
        });
        img = (ImageView) findViewById(R.id.five5);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Adventures.this, Detail.class);
                mainIntent.putExtra("position", "five");
                startActivity(mainIntent);
            }
        });
        img = (ImageView) findViewById(R.id.six6);
        //set a onclick listener for when the button gets clicked
        img.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(Adventures.this, Detail.class);
                mainIntent.putExtra("position", "six");
                startActivity(mainIntent);
            }
        });
    }
}