package com.soferr.viewpager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {


    List<video> videoList;

    public VideoAdapter(List<video> videoList){
        this.videoList= videoList;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.each_video,parent,false);

        return new VideoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

        holder.setVideoData(videoList.get(position));

    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }
    public class VideoViewHolder extends RecyclerView.ViewHolder{

        VideoView videoView;
        TextView title,desc,tvFollow;
        ImageView likeImg,commentImg,shareImg,bookmarkImg;
        Context context;
        CardView follow_Card;

      public MediaPlayer mediaPlayer;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView= itemView.findViewById(R.id.videoView);
            likeImg= itemView.findViewById(R.id.likeImg);
            commentImg= itemView.findViewById(R.id.commentImg);
            shareImg= itemView.findViewById(R.id.shareImg);
            bookmarkImg= itemView.findViewById(R.id.bookmarkImg);
            tvFollow= itemView.findViewById(R.id.tvFollow);
            follow_Card= itemView.findViewById(R.id.follow_Card);
        }
        //////This line problem here
        public void setVideoData (video videox){

            videoView.setVideoPath(videox.getVideoUrl());
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {

                    //mediaPlayer.start();

                    Float videoRatio = mediaPlayer.getVideoWidth() / (float) mediaPlayer.getVideoHeight();
                    Float screenRatio = videoView.getWidth() / (float) videoView.getHeight();

                    Float scale= videoRatio / screenRatio;


                    if (scale>= 1f ){
                        videoView.setScaleX(scale);
                    }else {
                        videoView.setScaleY(1f/scale);
                    }
                }
            });

           /* Toast.makeText(itemView.getContext(), "Calling....", Toast.LENGTH_LONG).show();
            Toast.makeText(itemView.getContext(), "Calling....", Toast.LENGTH_LONG).show();
*/

            likeImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    likeImg.setImageResource(R.drawable.heart_red);

                    Toast.makeText(itemView.getContext(), "liked", Toast.LENGTH_SHORT).show();

                }
            });
            bookmarkImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    bookmarkImg.setImageResource(R.drawable.bookmark_red);
                    Toast.makeText(itemView.getContext(), "Added To Favorites", Toast.LENGTH_SHORT).show();

                }
            });

            follow_Card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvFollow.setText("Following");
                }
            });
            //>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<
            //>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<
            //>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<
            if (mediaPlayer!=null) mediaPlayer.release();

            mediaPlayer= MediaPlayer.create(itemView.getContext(),R.raw.call);
            mediaPlayer.start();

            videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                @Override
                public boolean onInfo(MediaPlayer mp, int what, int extra) {

                    if (what == MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START) {
                      //  Toast.makeText(itemView.getContext(), "Video Start", Toast.LENGTH_SHORT).show();


                      //  mediaPlayer.release();

                        // Here the video starts
                        return true;
                    }




                    return true;


                }
            });

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    // Video playback has completed
                    // You can perform any desired action here



                    //Toast.makeText(itemView.getContext(), "Video End", Toast.LENGTH_SHORT).show();



                }
            });



        }


    }



}
