package com.example.two;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import androidx.appcompat.widget.AppCompatImageView;

import java.lang.reflect.Array;

public class FirstFragment extends Fragment {

    ImageView img;

    public FirstFragment() {
        // Required empty public constructor
    }
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
//get the button view
//        img = (ImageView) rootView.findViewById(R.id.one);
//        //set a onclick listener for when the button gets clicked
//        img.setOnClickListener(new View.OnClickListener() {
//            //Start new list activity
//            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(), Detail.class);
//                mainIntent.putExtra("position", "one");
//                startActivity(mainIntent);
//            }
//        });
//
//        img = (ImageView) rootView.findViewById(R.id.two);
//        //set a onclick listener for when the button gets clicked
//        img.setOnClickListener(new View.OnClickListener() {
//            //Start new list activity
//            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(), Detail.class);
//                mainIntent.putExtra("position", "two");
//                startActivity(mainIntent);
//            }
//        });
//
//        img = (ImageView) rootView.findViewById(R.id.three);
//        //set a onclick listener for when the button gets clicked
//        img.setOnClickListener(new View.OnClickListener() {
//            //Start new list activity
//            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(), Detail.class);
//                mainIntent.putExtra("position", "three");
//                startActivity(mainIntent);
//            }
//        });
//        img = (ImageView) rootView.findViewById(R.id.four);
//        //set a onclick listener for when the button gets clicked
//        img.setOnClickListener(new View.OnClickListener() {
//            //Start new list activity
//            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(), Detail.class);
//                mainIntent.putExtra("position", "four");
//                startActivity(mainIntent);
//            }
//        });
//        img = (ImageView) rootView.findViewById(R.id.five);
//        //set a onclick listener for when the button gets clicked
//        img.setOnClickListener(new View.OnClickListener() {
//            //Start new list activity
//            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(), Detail.class);
//                mainIntent.putExtra("position", "five");
//                startActivity(mainIntent);
//            }
//        });
//        img = (ImageView) rootView.findViewById(R.id.six);
//        //set a onclick listener for when the button gets clicked
//        img.setOnClickListener(new View.OnClickListener() {
//            //Start new list activity
//            public void onClick(View v) {
//                Intent mainIntent = new Intent(getActivity(), Detail.class);
//                mainIntent.putExtra("position", "six");
//                startActivity(mainIntent);
//            }
//        });

        return rootView;
    }
}


