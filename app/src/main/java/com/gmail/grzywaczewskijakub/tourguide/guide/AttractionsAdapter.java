package com.gmail.grzywaczewskijakub.tourguide.guide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by jakub on 2017-06-24.
 */

public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    private int colorResourceId;

    public AttractionsAdapter(Activity context, ArrayList<Attractions> attractions, int colorResourceId) {
        super(context, 0, attractions);
        this.colorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        return listItemView;
    }
}
