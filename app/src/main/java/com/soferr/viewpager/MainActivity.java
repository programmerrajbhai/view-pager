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

       //videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.sang1, "New Title okay2", "new description here2"));

        videoList = new ArrayList<>();
       // videoList.add(new video("https://laralive.xyz/Video/WhatsApp%20Video%202024-05-03%20at%2015.57.48%204.10.52%E2%80%AFPM.mp4", "New Title okay", "new description here"));
       // videoList.add(new video("", "New Title okay", "new description here"));
       // videoList.add(new video("https://laralive.xyz/Video/Call_Item/video%20%281%29.mp4", "New Title okay", "new description here"));

        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.video, "New Title okay2", "new description here2"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.video, "New Title okay2", "new description here2"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.video, "New Title okay2", "new description here2"));
        videoList.add(new video("android.resource://" + getPackageName() + "/" + R.raw.video, "New Title okay2", "new description here2"));

        viewPager2 = findViewById(R.id.viewPager2);
        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
        viewPager2.setUserInputEnabled(true);
        Collections.shuffle(videoList);

    }

}