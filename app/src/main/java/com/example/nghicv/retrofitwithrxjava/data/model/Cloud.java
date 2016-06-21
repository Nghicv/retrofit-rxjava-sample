package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nghicv on 21/06/2016.
 */
public class Cloud {

    @SerializedName("all")
    private int mAll;

    public int getmAll() {
        return mAll;
    }

    public void setmAll(int mAll) {
        this.mAll = mAll;
    }
}
