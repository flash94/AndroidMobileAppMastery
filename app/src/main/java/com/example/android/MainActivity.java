package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mzero = 0;
    private int mCount = 0;
    private TextView mShowCount;
    private Button countBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        countBtn = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount %2 == 0){
            countBtn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
    }

    public void zeroDown(View view) {
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mzero));
    }
}