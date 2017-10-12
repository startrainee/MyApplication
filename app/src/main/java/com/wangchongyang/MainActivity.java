package com.wangchongyang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.wangchongyang.myapplication.FirstActivity;
import com.wangchongyang.myapplication.R;
import com.wangchongyang.myapplication.map.MapActivity;
import com.wangchongyang.myapplication.mirror.Second2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMovieActivity(View view){
        startActivity(new Intent(this, FirstActivity.class));
    }
    public void startMapActivity(View view){
        startActivity(new Intent(this, MapActivity.class));
    }
    public void startScrollActivity(View view){
        startActivity(new Intent(this, Second2Activity.class));
    }
}
