package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        final ArrayList<Attractions> monumnetsAttractions = new ArrayList<Attractions>();
        monumnetsAttractions.add(new Attractions(this.getString(R.string.monuments_name_palace), this.getString(R.string.monuments_address_palace), R.drawable.sokol_palace));
        monumnetsAttractions.add(new Attractions(this.getString(R.string.monuments_name_church_bvm), this.getString(R.string.monuments_address_church_bvm), R.drawable.church_bvm));
        monumnetsAttractions.add(new Attractions(this.getString(R.string.monuments_name_church_tol), this.getString(R.string.monuments_address_church_tol), R.drawable.church_toc));
        monumnetsAttractions.add(new Attractions(this.getString(R.string.monuments_name_rsrf), this.getString(R.string.monuments_address_rsrf), R.drawable.zntk));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(this, monumnetsAttractions, R.color.colorListItem);

        ListView listView = (ListView) findViewById(R.id.monuments_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Attractions attraction = monumnetsAttractions.get(position);
            }
        });
    }
}
