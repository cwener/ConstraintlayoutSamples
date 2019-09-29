package com.example.mydemo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mydemo.view.RedBg;
import com.example.mydemo.view.TimeCountDownDrawable;

public class BgTestActivity extends AppCompatActivity {
    private LinearLayout container;
    private ImageView mTestIv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        container = findViewById(R.id.container);
//        RedBg redBg = new RedBg();
        mTestIv = findViewById(R.id.image);
        TimeCountDownDrawable redBg = new TimeCountDownDrawable();
        redBg.setBounds(0, 0, 100, 100);
        redBg.setProgress(15);
        mTestIv.setBackground(redBg);
    }
}
