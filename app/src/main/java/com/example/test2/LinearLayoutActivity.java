package com.example.test2;

// LinearLayoutActivity.java (以创建新Activity为例)

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout); // 使用上面创建的布局文件
    }
}