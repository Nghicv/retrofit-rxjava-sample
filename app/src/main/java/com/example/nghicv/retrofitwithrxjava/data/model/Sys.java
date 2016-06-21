package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nghicv on 21/06/2016.
 */
public class Sys {

    @SerializedName("type")
    private int mType;

    @SerializedName("id")
    private int mId;

    @SerializedName("message")
    private String mMessage;

    @SerializedName("country")
    private String mCountry;

    @SerializedName("sunrise")
    private String mSunrise;

    @SerializedName("sunset")
    private String mSunset;

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmSunrise() {
        return mSunrise;
    }

    public void setmSunrise(String mSunrise) {
        this.mSunrise = mSunrise;
    }

    public String getmSunset() {
        return mSunset;
    }

    public void setmSunset(String mSunset) {
        this.mSunset = mSunset;
    }
}
