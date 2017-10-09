package com.wangchongyang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void startFiveActivity(View view) {
        Intent intent = new Intent();
        intent.setClass(this,FiveActivity.class);
        startActivity(intent);
    }
}
