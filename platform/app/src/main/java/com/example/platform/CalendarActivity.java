package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends AppCompatActivity {
    private Button btn_calendarBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);



        btn_calendarBack=(Button)findViewById(R.id.btn_calendarBack1);


        btn_calendarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToPingpong=new Intent(CalendarActivity.this,pingpongActivity.class);
                startActivity(intentGoToPingpong);
            }
        });
    }
}
