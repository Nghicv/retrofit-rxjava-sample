
package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    public double mTemp;

    @SerializedName("pressure")
    public double mPressure;

    @SerializedName("humidity")
    public double mHumidity;

    @SerializedName("temp_min")
    public double mTempMin;

    @SerializedName("temp_max")
    public double mTempMax;

    public Main(double mTemp, double mPressure, Integer mHumidity, double mTempMin, double mTempMax) {
        this.mTemp = mTemp;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        this.mTempMin = mTempMin;
        this.mTempMax = mTempMax;
    }
}
