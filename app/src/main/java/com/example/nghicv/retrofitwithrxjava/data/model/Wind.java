package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nghicv on 21/06/2016.
 */
public class Wind {

    @SerializedName("speed")
    private double mSpeed;

    @SerializedName("deg")
    private double mDeg;

    public double getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(double mSpeed) {
        this.mSpeed = mSpeed;
    }

    public double getmDeg() {
        return mDeg;
    }

    public void setmDeg(double mDeg) {
        this.mDeg = mDeg;
    }
}
