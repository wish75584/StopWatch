package com.felixtechlabs.stopwatch;

import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
    }


    public void startChronometer(View view) {

        if(!running ){
            chronometer.start();
            running = true;
        }
    }
}
