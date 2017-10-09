package com.wangchongyang.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class FirstActivity extends AppCompatActivity {
    private int indexOfBg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void startSecondActivity(View view) {
                Intent intent = new Intent();
                intent.setClass(this,SecondActivity.class);
                startActivity(intent);
                finish();
    }

    public void changeBackGround(View view) {

        View tView = findViewById(R.id.root_first);
        Drawable drawable = null;
        switch (indexOfBg){
            case 0 :
                drawable = getDrawable(R.drawable.first_bg_1);
                break;
            case 1 :
                drawable = getDrawable(R.drawable.first_bg_2);
                break;
            case 2 :
                drawable = getDrawable(R.drawable.first_bg_3);
                break;
            default:
                startSecondActivity(findViewById(R.id.jump_btn));
                return;
        }
        if(indexOfBg <= 2) indexOfBg++;
        tView.setBackground(drawable);



    }

}
