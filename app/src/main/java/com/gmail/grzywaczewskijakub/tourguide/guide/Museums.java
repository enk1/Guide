package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Museums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        final ArrayList<Attractions> museumsAttractions = new ArrayList<Attractions>();
        museumsAttractions.add(new Attractions(this.getString(R.string.museums_name_steelwork), this.getString(R.string.museums_address_steelwork), R.drawable.steelworks_museum));
        museumsAttractions.add(new Attractions(this.getString(R.string.museums_name_dulag), this.getString(R.string.museums_address_dulag), R.drawable.dulag_museum));
        museumsAttractions.add(new Attractions(this.getString(R.string.museums_name_heritage), this.getString(R.string.museums_address_heritage), R.drawable.cdk));
        museumsAttractions.add(new Attractions(this.getString(R.string.museums_name_palace), this.getString(R.string.museums_address_palace), R.drawable.palacyk_center));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(this, museumsAttractions, R.color.colorListItem);

        ListView listView = (ListView) findViewById(R.id.museums_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Attractions attraction = museumsAttractions.get(position);
            }
        });
    }
}
