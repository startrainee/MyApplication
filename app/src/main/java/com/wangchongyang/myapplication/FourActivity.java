package com.wangchongyang.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.VideoView;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarOfFour);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar_four, menu);
        return true;
    }

    public void startFiveActivity(View view) {
        Intent intent = new Intent();
        intent.setClass(this,FiveActivity.class);
        startActivity(intent);
    }
    public void watchVideo(View view){
        VideoView vv = (VideoView) findViewById(R.id.video_view_four);
        //MediaController mc = new MediaController(this);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.myvideo;
        Log.d("fourActivity","video uri : " + uri);
        // vv.setMediaController(mc);
        vv.setVideoURI(Uri.parse(uri));
        vv.start();
    }
}
