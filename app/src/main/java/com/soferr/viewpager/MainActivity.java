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
/*
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2848%29.mp4", "New Title okay", "new description here"));



        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2849%29.mp4", "New Title okay", "new description here"));
        //No call
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2850%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2851%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2852%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/video_reels/myvideo%20%2853%29.mp4", "New Title okay", "new description here"));
*/

        videoList.add(new video("https://miralive.xyz/Natural/natural%20%281%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%282%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%283%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%284%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%285%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%286%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%287%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%288%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%289%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2810%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2811%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2812%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2813%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2814%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2815%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2816%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2817%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2818%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2819%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2820%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2821%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2822%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2823%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2824%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2825%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2826%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2827%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2828%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2829%29.mp4", "New Title okay", "new description here"));
        videoList.add(new video("https://miralive.xyz/Natural/natural%20%2830%29.mp4", "New Title okay", "new description here"));


        viewPager2 = findViewById(R.id.viewPager2);
        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
        viewPager2.setUserInputEnabled(true);
        Collections.shuffle(videoList);

    }

}