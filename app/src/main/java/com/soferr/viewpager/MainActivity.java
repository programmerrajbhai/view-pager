package com.soferr.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private ViewPager2 viewPager2;
    private List<video> videoList;
    private VideoAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        videoList = new ArrayList<>();


//No call
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));



        videoList.add(new video("https://miralive.xyz/video/a%20(1).mp4", "New Title okay", "new description here"));
        //No call
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/videot/no_call.mp4", "New Title okay", "new description here"));

        viewPager2 = findViewById(R.id.viewPager2);

        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
        viewPager2.setUserInputEnabled(false);
        Collections.shuffle(videoList);

    }

}