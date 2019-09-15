package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mydemo.helper.GroupHelper;

public class MainActivity extends AppCompatActivity {
    private Button test;
    private GroupHelper groupHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = findViewById(R.id.test);
        groupHelper = findViewById(R.id.groupHelper);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
                groupHelper.animate().setDuration(1000).translationY(300);
//                groupHelper.setVisibility(View.GONE);
            }
        });
    }
}
