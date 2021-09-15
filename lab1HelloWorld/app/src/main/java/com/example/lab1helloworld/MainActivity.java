package com.example.lab1helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView text = (TextView) findViewById(R.id.text1);
        text.setText("Hello World!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}