package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jakub on 2017-06-24.
 */

public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    private int colorResourceId;

    public AttractionsAdapter(Activity context, ArrayList<Attractions> attractions, int newColorResourceId) {
        super(context, 0, attractions);
        this.colorResourceId = newColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attractions currentAttraction = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentAttraction.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentAttraction.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_text_view);

        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImgResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
