package com.wangchongyang.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void startSecondActivity(View view) {
            Intent intent = new Intent();
            intent.setClass(this,SecondActivity.class);
            startActivity(intent);
        }
}
