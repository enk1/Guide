package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        final ArrayList<Attractions> foodAttractions = new ArrayList<Attractions>();
        foodAttractions.add(new Attractions(this.getString(R.string.food_name_fabrizio), this.getString(R.string.food_address_fabrizio), R.drawable.fabrizio));
        foodAttractions.add(new Attractions(this.getString(R.string.food_name_tratoria), this.getString(R.string.food_address_tratoria), R.drawable.trattoria));
        foodAttractions.add(new Attractions(this.getString(R.string.food_name_tabla), this.getString(R.string.food_address_tabla), R.drawable.tabla));
        foodAttractions.add(new Attractions(this.getString(R.string.food_name_corrado), this.getString(R.string.food_address_corrado), R.drawable.corrado));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(this, foodAttractions, R.color.colorListItem);

        ListView listView = (ListView) findViewById(R.id.food_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Attractions attraction = foodAttractions.get(position);
            }
        });
    }
}
