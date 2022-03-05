package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = (TextView) findViewById(R.id.countTv);
        Intent intent = getIntent();
        String message = intent.getStringExtra("currentCount");

        // Put that message into the text_message TextView
        mShowCount.setText(message);
    }



}