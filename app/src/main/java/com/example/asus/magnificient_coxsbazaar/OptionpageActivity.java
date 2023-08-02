package com.example.asus.magnificient_coxsbazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionpage);

        Button but1 = (Button) findViewById(R.id.touristspots);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, TouristSpotsActivity.class);
                startActivity(intent);
            }
        });


        Button but2 = (Button) findViewById(R.id.transportations);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, TransportationsActivity.class);
                startActivity(intent);
            }
        });


        Button but3 = (Button) findViewById(R.id.hotels);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });


        Button but4 = (Button) findViewById(R.id.restaurants);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });


        Button but5 = (Button) findViewById(R.id.souvenirshops);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, SouvenirShopsActivity.class);
                startActivity(intent);
            }
        });


        Button but6 = (Button) findViewById(R.id.maps);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


        Button but7 = (Button) findViewById(R.id.history);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionpageActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

    }
}
