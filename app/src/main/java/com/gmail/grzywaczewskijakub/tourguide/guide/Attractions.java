package com.gmail.grzywaczewskijakub.tourguide.guide;

/**
 * Created by jakub on 2017-06-24.
 */

public class Attractions {
    private String name;
    private String address;
    private int imgResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attractions() {
        this.name = "undefined";
        this.address = "undefined";
        this.imgResourceId = NO_IMAGE_PROVIDED;
    }

    public Attractions(String name, String address, int imgResourceId) {
        this.name = name;
        this.address = address;
        this.imgResourceId = imgResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImgResourceId() {
        return imgResourceId;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasImage() {
        return imgResourceId != NO_IMAGE_PROVIDED;
    }
}
