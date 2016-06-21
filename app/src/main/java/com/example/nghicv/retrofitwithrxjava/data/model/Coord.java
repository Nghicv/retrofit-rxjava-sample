package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nghicv on 21/06/2016.
 */
public class Coord {
    @SerializedName("lon")
    private double mLon;

    @SerializedName("lat")
    private double mLat;

    public double getLon() {
        return mLon;
    }

    public void setLon(double mLon) {
        this.mLon = mLon;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double mLat) {
        this.mLat = mLat;
    }
}
