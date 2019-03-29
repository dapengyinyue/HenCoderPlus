package com.example.a20_gradle_all;


import android.os.Bundle;

import com.hencoder.gradledemo.BuildTypeUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuildTypeUtils.drawBadge(this);
    }
}
