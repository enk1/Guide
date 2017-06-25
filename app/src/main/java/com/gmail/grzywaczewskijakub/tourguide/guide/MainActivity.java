package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView food = (TextView) findViewById(R.id.food);
        TextView monuments = (TextView) findViewById(R.id.monuments);
        TextView museums = (TextView) findViewById(R.id.museums);
        TextView sport = (TextView) findViewById(R.id.sport);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });

        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(foodIntent);
            }
        });

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(foodIntent);
            }
        });

        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, SportActivity.class);
                startActivity(foodIntent);
            }
        });


    }
}
