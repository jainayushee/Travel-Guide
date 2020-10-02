package com.example.two;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

public class Detail extends AppCompatActivity {

    ImageView img;
    TextView text, des;
    Resources res;
    Toolbar mToolbar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horiz);


        mToolbar = (Toolbar) findViewById(R.id.toolbar);


        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




        Intent intent = getIntent();
        String i=intent.getStringExtra("position");

        res= getResources();
       // String t[]= res.getStringArray(R.array.titles);
        String d[]= res.getStringArray(R.array.descriptions);
        String ad[]= res.getStringArray(R.array.adventure_descriptions);

        img= findViewById(R.id.image);
        text= findViewById(R.id.title);
        des=findViewById(R.id.description);


        if (i.equals("one"))
        {
            String heading=("Aga Khan Palace");
            img.setImageResource(R.drawable.agone);
            String booking=("https://in.bookmyshow.com/activities/aga-khan-palace-building/ET00091085"); // missing 'http://' will cause crashed
            String location = ("https://www.google.co.in/maps/place/Aga+Khan+Palace/@18.5524942,73.8992676,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2c11768711b1b:0xac1ba97447d569f4!8m2!3d18.5524942!4d73.9014563"); // missing 'http://' will cause crashed
            setDetails(heading, d[0], 0, location, booking);


        }

        else if (i.equals("two"))
        {
            String heading="Shaniwar Wada";
            img.setImageResource(R.drawable.shaniwar);
            String booking = ("https://in.bookmyshow.com/activities/shaniwarwada/ET00091088"); // missing 'http://' will cause crashed

            String location=("https://www.google.co.in/maps/place/Shaniwar+Wada/@18.5194589,73.8531296,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2c065144d8edf:0x3703b8095866c54b!8m2!3d18.5194589!4d73.8553183"); // missing 'http://' will cause crashed
            setDetails(heading, d[1], 0, location, booking);



        }
        else if (i.equals("three"))
        {
            String booking="";
            String heading = ("Pune-Okayama Friendship Garden");
            img.setImageResource(R.drawable.garden);
            String location= ("https://www.google.co.in/maps/place/Pune-Okayama+Friendship+Garden/@18.4914531,73.8346002,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2bff990000001:0x3291e3e36f9ad234!8m2!3d18.4914531!4d73.8367889"); // missing 'http://' will cause crashed
            setDetails(heading, d[2], 1, location, booking);

        }
        else if (i.equals("four"))
        {
            String booking="";
            String heading =("Sinhgad Fort");
            img.setImageResource(R.drawable.sinhgad);
            String location =("https://www.google.co.in/maps/place/Sinhagad+Fort/@18.366277,73.753689,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc293e6861118d9:0xcbb4d589c7d4e90b!8m2!3d18.366277!4d73.7558777"); // missing 'http://' will cause crashed
            setDetails(heading, d[3], 1, location, booking);

        }
        else if (i.equals("five"))
        {
            String booking="";
            String heading= ("Parvati Hill");
            img.setImageResource(R.drawable.parvati);
            String location =("https://www.google.co.in/maps/place/Parvati+Hill/@18.4971126,73.845892,18z/data=!3m1!4b1!4m5!3m4!1s0x3bc2c008d9cdb0d5:0xfee5bbe3b35ed335!8m2!3d18.496926!4d73.8466847"); // missing 'http://' will cause crashed
            setDetails(heading, d[4], 1, location, booking);
        }
        else if (i.equals("six"))
        {
            String booking="";
            img.setImageResource(R.drawable.pashan);
            String location= "https://www.google.co.in/maps/place/Pashan+Lake/@18.5328239,73.7802333,16z/data=!3m1!4b1!4m5!3m4!1s0x3bc2befadc9c087b:0x19a6ecd1a140986c!8m2!3d18.5343969!4d73.7852922";
            String heading = ("Pashan Lake");
            setDetails(heading, d[5], 1, location, booking );
        }

        //Adventure intents
        else if(i.equals(("aone"))){

            String booking="";
            img.setImageResource(R.drawable.pashan);
            String location= "https://www.google.co.in/maps/place/Pashan+Lake/@18.5328239,73.7802333,16z/data=!3m1!4b1!4m5!3m4!1s0x3bc2befadc9c087b:0x19a6ecd1a140986c!8m2!3d18.5343969!4d73.7852922";
            String heading = ("Pashan Lake");
            setDetails(heading, d[5], 1, location, booking );

        }
    }

    public void setDetails(String heading, String description, final int i, final String locat, final String booking )
    {
        mToolbar.setTitle(heading);
        des.setText(description);
        CardView cd= findViewById(R.id.book);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==1){
                Toast.makeText(getApplicationContext(),
                        "No Booking Required!",
                        Toast.LENGTH_LONG)
                        .show();}
                else{
                    Uri uri = Uri.parse(booking); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);

                }
            }
        });

        CardView cd1= findViewById(R.id.contact);
        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9999999999"));
                startActivity(intent);
            }
        });

        CardView cd2= findViewById(R.id.directions);
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(locat); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
