package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        final ArrayList<Attractions> sportAttractions = new ArrayList<Attractions>();
        sportAttractions.add(new Attractions("Znicz Pruszków Stadium", "Bohaterów Warszawy 4, 00-001 Pruszków", R.drawable.znicz_stadium));
        sportAttractions.add(new Attractions("Kapry's Swimming Pool", "Andrzeja 3, 05-800 Pruszków", R.drawable.kapry));
        sportAttractions.add(new Attractions("BGŻ Arena", "Andrzeja 1, 05-800 Pruszków", R.drawable.bgz_arena));
        sportAttractions.add(new Attractions("Sports and Entertainment Hall MZOS ZNICZ", "Bohaterów Warszawy 4, 00-001 Pruszków", R.drawable.znicz_hall));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(this, sportAttractions, R.color.colorListItem);

        ListView listView = (ListView) findViewById(R.id.sport_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Attractions attraction = sportAttractions.get(position);
            }
        });
    }
}
