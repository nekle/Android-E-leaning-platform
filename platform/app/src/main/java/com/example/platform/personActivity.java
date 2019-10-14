package com.example.platform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class personActivity extends AppCompatActivity {
    private Button btn_personHome;
    private Button btn_personExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);


        btn_personHome=(Button)findViewById(R.id.btn_personHome);
        btn_personExit=(Button)findViewById(R.id.btn_personExit);


        btn_personExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGoToLoin=new Intent(personActivity.this, loginActivity.class);
                startActivity(intentGoToLoin);
            }
        });

        btn_personHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentGoToHome=new Intent(personActivity.this,MainActivity.class);
                startActivity(intentGoToHome);

            }
        });
    }
}
