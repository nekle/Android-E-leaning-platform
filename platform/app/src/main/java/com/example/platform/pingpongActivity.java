package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class pingpongActivity extends AppCompatActivity {
    private TextView textView_pingpong;
    private Button btn_register;
    private Button btn_calendar;
    private ImageButton imageButton_goToVideo;
    private Button btn_pingpongBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingpong);


        textView_pingpong=(TextView)findViewById(R.id.textView_pingpong);
        String text=("  乒乓球（table tennis），中国国球，是一种世界流行的球类体育项目，"+
        "包括进攻、对抗和防守。比赛分团体、单打、双打、混双等数种；"+
        "2001年9月1日前以21分为一局，现以11分为一局；采用五局三胜，"+
        "七局四胜。乒乓球为圆球状，重2.53-2.70克，白或橙色，"+
         "以高分子聚合物为原料的新塑料球。\n  我们的平台提供乒乓球的教学视频以及实战演练课程,欢迎报名参加!!!，"
        );
        textView_pingpong.setText(text);


        btn_calendar=(Button)findViewById(R.id.btn_calendar);
        btn_register=(Button)findViewById(R.id.btn_register);
        imageButton_goToVideo=(ImageButton)findViewById(R.id.imageButton_goToVideo);
        btn_pingpongBack=(Button)findViewById(R.id.btn_pingpongBack);


        btn_pingpongBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToList=new Intent(pingpongActivity.this,MainActivity.class);
                startActivity(intentGoToList);
            }
        });


        imageButton_goToVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToVideo=new Intent(pingpongActivity.this,videoActivity.class);
                startActivity(intentGoToVideo);
            }
        });

        btn_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_gotocalendar=new Intent(pingpongActivity.this,CalendarActivity.class);
                startActivity(intent_gotocalendar);
            }
        });



        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_gotoregister=new Intent(pingpongActivity.this,registerActivity.class);
                startActivity(intent_gotoregister);
            }
        });
    }
}
