package com.wangchongyang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("3activity","onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void startFourActivity(View view) {
        Intent intent = new Intent();
        intent.setClass(this,FourActivity.class);
        startActivity(intent);
    }
}
