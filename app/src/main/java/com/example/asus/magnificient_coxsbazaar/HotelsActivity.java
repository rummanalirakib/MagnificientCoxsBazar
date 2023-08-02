package com.example.asus.magnificient_coxsbazaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        Button but1=(Button) findViewById(R.id.starhotel5);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelsActivity.this, StarHotel5Activity.class);
                startActivity(intent);
            }
        });
        Button but2=(Button) findViewById(R.id.starhotel4);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelsActivity.this, StarHotel4Activity.class);
                startActivity(intent);
            }
        });
        Button but3=(Button) findViewById(R.id.starhotel3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelsActivity.this, StarHotel3Activity.class);
                startActivity(intent);
            }
        });



    }
}
