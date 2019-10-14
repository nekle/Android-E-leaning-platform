package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerActivity extends AppCompatActivity {
    private Button btn_returnToPingpong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_acitivity);


        btn_returnToPingpong=(Button)findViewById(R.id.btn_returnToPingpong);
        btn_returnToPingpong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentGoToPingpong=new Intent(registerActivity.this,pingpongActivity.class);
                startActivity(IntentGoToPingpong);
            }
        });
    }
}
