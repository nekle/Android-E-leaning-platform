package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;
import android.widget.MediaController;

public class videoActivity extends AppCompatActivity {
    private VideoView videoView_pingpong;
    private ImageButton imageButton_playVideoPingpong;
    private Button btn_videoBack;
    MediaController mMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        btn_videoBack=(Button)findViewById(R.id.btn_videoBack1);
        mMediaController = new MediaController(this);
        videoView_pingpong=(VideoView)findViewById(R.id.videoView_pingpong);
        imageButton_playVideoPingpong=(ImageButton)findViewById(R.id.imageButton_playVideoPingpong);


        btn_videoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_goToPingpong=new Intent(videoActivity.this,pingpongActivity.class);
                startActivity(intent_goToPingpong);
            }
        });

        imageButton_playVideoPingpong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri ="raw/ex1.mp4";
                videoView_pingpong.setVideoPath("raw/ex1.mp4");
               // videoView_pingpong.setVideoURI(Uri.parse(uri));
                mMediaController.setMediaPlayer(videoView_pingpong);
                videoView_pingpong.setMediaController(mMediaController);
                videoView_pingpong.start();
            }
        });

    }
}
