package com.example.android.trada;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Đặt nội dung của activity để dùng trong activity_main.xml layout
        setContentView(R.layout.activity_main);
    }
}