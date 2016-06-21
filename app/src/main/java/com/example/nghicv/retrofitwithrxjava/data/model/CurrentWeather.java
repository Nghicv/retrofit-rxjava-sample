package com.example.nghicv.retrofitwithrxjava.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nghicv on 21/06/2016.
 */
public class CurrentWeather {

    @SerializedName("coord")
    private Coord mCoord;

    @SerializedName("weather")
    private List<Weather> mWeather;

    @SerializedName("base")
    private String mBase;

    @SerializedName("main")
    private Main mMain;

    @SerializedName("wind")
    private Wind mWind;

    @SerializedName("rain")
    private String mRain;

    @SerializedName("clouds")
    private Cloud mCloud;

    @SerializedName("dt")
    private int mDt;

    @SerializedName("sys")
    private Sys mSys;

    @SerializedName("id")
    private int mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("cod")
    private int mCood;

    public Coord getmCoord() {
        return mCoord;
    }

    public void setmCoord(Coord mCoord) {
        this.mCoord = mCoord;
    }

    public List<Weather> getmWeather() {
        return mWeather;
    }

    public void setmWeather(List mWeather) {
        this.mWeather = mWeather;
    }

    public String getmBase() {
        return mBase;
    }

    public void setmBase(String mBase) {
        this.mBase = mBase;
    }

    public Main getmMain() {
        return mMain;
    }

    public void setmMain(Main mMain) {
        this.mMain = mMain;
    }

    public Wind getmWind() {
        return mWind;
    }

    public void setmWind(Wind mWind) {
        this.mWind = mWind;
    }

    public String getmRain() {
        return mRain;
    }

    public void setmRain(String mRain) {
        this.mRain = mRain;
    }

    public Cloud getmCloud() {
        return mCloud;
    }

    public void setmCloud(Cloud mCloud) {
        this.mCloud = mCloud;
    }

    public int getmDt() {
        return mDt;
    }

    public void setmDt(int mDt) {
        this.mDt = mDt;
    }

    public Sys getmSys() {
        return mSys;
    }

    public void setmSys(Sys mSys) {
        this.mSys = mSys;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCood() {
        return mCood;
    }

    public void setmCood(int mCood) {
        this.mCood = mCood;
    }
}
