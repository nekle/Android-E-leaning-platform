package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class volleyballActivity extends AppCompatActivity {
    private TextView textView_volleyball;
    private Button btn_register2;
    private Button btn_calendar2;
    private ImageButton imageButton_goToVideo2;
    private Button btn_pingpongBack2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volleyball);


        textView_volleyball=(TextView)findViewById(R.id.textView_pingpong);
        String text=("  排球（volleyball）是球类运动项目之一，球场长方形，" +
                "中间隔有高网，比赛双方（每方六人）各占球场的一方，" +
                "球员用手把球从网上空打来打去。排球运动使用的球，" +
                "用羊皮或人造革做壳，橡胶做胆，大小和足球相似。" +
                "\n  我们的平台提供乒乓球的教学视频以及实战演练课程,欢迎报名参加!!!，"
        );
        textView_volleyball.setText(text);


        btn_calendar2=(Button)findViewById(R.id.btn_calendar);
        btn_register2=(Button)findViewById(R.id.btn_register);
        imageButton_goToVideo2=(ImageButton)findViewById(R.id.imageButton_goToVideo);
        btn_pingpongBack2=(Button)findViewById(R.id.btn_pingpongBack);


        btn_pingpongBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToList=new Intent(volleyballActivity.this,MainActivity.class);
                startActivity(intentGoToList);
            }
        });


        imageButton_goToVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToVideo=new Intent(volleyballActivity.this,videoActivity.class);
                startActivity(intentGoToVideo);
            }
        });

        btn_calendar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_gotocalendar=new Intent(volleyballActivity.this,CalendarActivity.class);
                startActivity(intent_gotocalendar);
            }
        });



        btn_register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_gotoregister=new Intent(volleyballActivity.this,registerActivity.class);
                startActivity(intent_gotoregister);
            }
        });
    }
}
