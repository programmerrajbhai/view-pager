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
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2848%29.mp4", "New Title okay", "new description here"));



        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2849%29.mp4", "New Title okay", "new description here"));
        //No call
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2850%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2851%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2852%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2853%29.mp4", "New Title okay", "new description here"));

        viewPager2 = findViewById(R.id.viewPager2);

        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
        viewPager2.setUserInputEnabled(true);
        Collections.shuffle(videoList);

    }

}