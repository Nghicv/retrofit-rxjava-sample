package com.example.nghicv.retrofitwithrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nghicv.retrofitwithrxjava.data.model.CurrentWeather;
import com.example.nghicv.retrofitwithrxjava.network.RetrofitWithRxAndroidService;
import com.example.nghicv.retrofitwithrxjava.network.ServiceBuilder;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_data)
    TextView mTextViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_load_data)
    void loadData() {
        RetrofitWithRxAndroidService retrofitWithRxAndroidService = ServiceBuilder.getService();
        Observable<CurrentWeather> currentWeatherObservable = retrofitWithRxAndroidService.getCurrentWeather("NamDinh", ServiceBuilder.API_KEY);
        currentWeatherObservable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<CurrentWeather>() {
                    @Override
                    public void call(CurrentWeather currentWeather) {
                        mTextViewData.setText(currentWeather.getmWeather().get(0).getmDescription());
                    }
                });
    }
}
