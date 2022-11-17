package com.example.guardience;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Handler;
import android.content.Intent;

public class intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // 3초 후 화면 전환
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(intro.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }
}