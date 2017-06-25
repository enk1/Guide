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
        museumsAttractions.add(new Attractions("Museum of the Ancient Mazovian Steelworks in Pruszków", "pl. Jana Pawła II 2\n" +
                "05-800 Pruszków", R.drawable.steelworks_museum));
        museumsAttractions.add(new Attractions("Dulag Museum 121", "ul. 3 Maja 8a\n" +
                "05-800 Pruszków", R.drawable.dulag_museum));
        museumsAttractions.add(new Attractions("Center for Cultural Heritage", "Bohaterów Warszawy 4\n" +
                "05-800 Pruszków", R.drawable.cdk));
        museumsAttractions.add(new Attractions("Youth Cultural Center \"Pałacyk\"", "Bohaterów Warszawy 4, 00-001 Pruszków", R.drawable.palacyk_center));

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
