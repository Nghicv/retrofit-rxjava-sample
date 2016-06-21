package com.example.nghicv.retrofitwithrxjava.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by nghicv on 20/06/2016.
 */
public class ServiceBuilder {
    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    public static final int TOKEN_EXPIRED = 401;
    public static final String API_KEY = "3af3c37646e32e897d522c3c2ac6585c";
    private static Retrofit sInstance;
    private static RetrofitWithRxAndroidService sService;

    private static Retrofit getRetrofit() {

        if (sInstance == null) {
            sInstance = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build();
        }

        return sInstance;
    }

    public static RetrofitWithRxAndroidService getService() {
        if (sService == null) {
            sService = getRetrofit().create(RetrofitWithRxAndroidService.class);
        }

        return sService;
    }
}
