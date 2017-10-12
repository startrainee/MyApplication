package com.wangchongyang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {
    private String[] from = { "image", "title" };
    private int[] to = { R.id.image, R.id.title };
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(getApplicationContext(),R.string.title_home,Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_dashboard:
                    Toast.makeText(getApplicationContext(),R.string.title_dashboard,Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_notifications:
                    Toast.makeText(getApplicationContext(),R.string.title_notifications,Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
    }

    private void init() {
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        GridView gridView = (GridView) findViewById(R.id.image_grid);
        ListAdapter adapter = new SimpleAdapter(this,getList(),R.layout.gridview_item_image_text,from,to);
        gridView.setAdapter(adapter);
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0 ){
                    startThirdActivity();
                }
            }
        };
        gridView.setOnItemClickListener(onItemClickListener);
    }
    public List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map;

        String[] titles = new String[] {"白夜追凶", "阿凡达","未来警察", "年轻style", "我们的父亲" };
        Integer[] images = { R.drawable.movie_dayandnight,R.drawable.movie_avatar,
                R.drawable.movie_policeman, R.drawable.movie_youngstyle, R.drawable.movie_ourfather,};

        for (int i = 0; i < images.length; i++) {
            map = new HashMap<>();
            map.put("image", images[i]);
            map.put("title", titles[i]);
            list.add(map);
        }
        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }
    public void startThirdActivity() {
        Intent intent = new Intent();
        intent.setClass(this,ThirdActivity.class);
        startActivity(intent);
    }
}
