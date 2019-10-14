package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn_pingpong;
    private Button btn_volleyball;
    private EditText editText_search;
    private    Button btn_goToPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_search=(EditText)findViewById(R.id.editText_serach);
        btn_pingpong=(Button)findViewById(R.id.btn_pingpong);
        btn_goToPerson=(Button)findViewById(R.id.btn_goToPerson);



        btn_goToPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToPerson=new Intent(MainActivity.this,personActivity.class);
                startActivity(intentGoToPerson);
            }
        });

        editText_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText_search.setText("");
            }
        });


        btn_pingpong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_pingpong=new Intent(MainActivity.this,pingpongActivity.class);
                startActivity(intent_pingpong);
            }
        });


        btn_volleyball=(Button)findViewById(R.id.btn_volleyball);
        btn_volleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_volleyball=new Intent(MainActivity.this,volleyballActivity.class);
                startActivity(intent_volleyball);
            }
        });

    }
}
