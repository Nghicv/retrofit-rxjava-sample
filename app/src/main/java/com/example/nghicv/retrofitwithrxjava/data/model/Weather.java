package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nghicv on 21/06/2016.
 */
public class Weather {

    @SerializedName("id")
    private int mId;

    @SerializedName("main")
    private String mMain;

    @SerializedName("description")
    private String mDescription;

    @SerializedName("icon")
    private String mIcon;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmMain() {
        return mMain;
    }

    public void setmMain(String mMain) {
        this.mMain = mMain;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }
}
