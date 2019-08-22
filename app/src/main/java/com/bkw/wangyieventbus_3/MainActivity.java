package com.bkw.wangyieventbus_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bkw.eventbusannotation.annotation.Subscribe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Subscribe
    public void onEvent(UserInfo userInfo) {
        Log.e("TAG", userInfo.toString());
    }
}
