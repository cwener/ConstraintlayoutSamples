package com.example.mydemo;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mydemo.view.RedBg;

public class BgTestActivity extends AppCompatActivity {
    private LinearLayout container;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        container = findViewById(R.id.container);
        RedBg redBg = new RedBg();
        container.setBackground(redBg);
    }
}
