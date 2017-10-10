package com.wangchongyang.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class FiveActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate()");
                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }

    public void startFiveActivity(View view) {
        Intent intent = new Intent();
        intent.setClass(this,FiveActivity.class);
        startActivity(intent);
    }
    public void watchVideo(View view){
        VideoView vv = (VideoView) findViewById(R.id.video_view_five);
        //MediaController mc = new MediaController(this);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.myvideo;
        Log.d("fourActivity","video uri : " + uri);
        // vv.setMediaController(mc);
        vv.setVideoURI(Uri.parse(uri));
        vv.start();
    }
}
