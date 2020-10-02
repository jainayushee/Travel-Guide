package com.example.two;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class ActivityTwo extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView listView;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setupListView();
    }




    private void setupListView() {

        CardView cd1= findViewById(R.id.places);
        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, Places.class);
                startActivity(intent);
            }
        });

        CardView cd2= findViewById(R.id.adventure);
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, Adventures.class);
                startActivity(intent);
            }
        });

        CardView cd3= findViewById(R.id.ld);
        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, Delicacies.class);
                startActivity(intent);
            }
        });

        CardView cd4= findViewById(R.id.le);
        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Feature not added",
                        Toast.LENGTH_LONG)
                        .show();
//                Intent intent = new Intent(ActivityTwo.this, Places.class);
//                startActivity(intent);
            }
        });

        CardView cd5= findViewById(R.id.nightlife);
        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Feature not added",
                        Toast.LENGTH_LONG)
                        .show();
//                Intent intent = new Intent(ActivityTwo.this, Places.class);
//                startActivity(intent);
            }
        });


    }

}








