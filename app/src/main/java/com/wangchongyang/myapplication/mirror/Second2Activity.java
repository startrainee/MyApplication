package com.wangchongyang.myapplication.mirror;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.*;
import com.wangchongyang.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Second2Activity extends AppCompatActivity {

    private TextView mTextMessage;
    private String[] from = { "image", "title" };
    private int[] to = { R.id.image, R.id.title };
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        init();
    }

    public List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map;

        String[] titles = new String[] { "阿凡达", "白夜追凶", "未来警察", "年轻style", "我们的父亲",};
        Integer[] images = { R.drawable.movie_avatar, R.drawable.movie_dayandnight,
                R.drawable.movie_policeman, R.drawable.movie_youngstyle, R.drawable.movie_ourfather};

        for (int i = 0; i < images.length; i++) {
            Log.d("sss","sss");
            map = new HashMap<>();
            map.put("image", images[i]);
            map.put("title", titles[i]);
            list.add(map);
        }
        return list;
    }

    private void init() {
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        GridView gridView = (GridView) findViewById(R.id.image_grid);
        ListAdapter adapter = new SimpleAdapter(this,getList(),R.layout.gridview_item_image_text,from,to);
        gridView.setAdapter(adapter);
    }

}
