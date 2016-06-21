package com.example.nghicv.retrofitwithrxjava.network;

import com.example.nghicv.retrofitwithrxjava.data.model.CurrentWeather;

import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by nghicv on 20/06/2016.
 */
public interface RetrofitWithRxAndroidService {

   @GET("weather")
    Observable<CurrentWeather> getCurrentWeather(@Query("q") String city, @Query("APPID") String apiKey);
}
