package com.example.androidfundamental012partb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.showToast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount ++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if (mCount % 2 == 0) {
            findViewById(R.id.button2).setBackgroundColor(Color.RED);
        } else {
            findViewById(R.id.button2).setBackgroundColor(Color.BLACK);
        }
        findViewById(R.id.button6).setBackgroundColor(Color.CYAN);
    }

    public void showZero(View view) {
        mCount =0;
        mShowCount.setText(Integer.toString(mCount));
        findViewById(R.id.button6).setBackgroundColor(Color.GRAY);
    }
}