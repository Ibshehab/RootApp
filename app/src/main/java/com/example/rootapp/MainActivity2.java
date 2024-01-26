package com.example.rootapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    String disc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        disc = getIntent().getStringExtra("course");
        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        int picture = bundle.getInt("photo");

        imageView.setImageResource(picture);

        TextView textView = new TextView(this);
        textView.setText(disc);

        // Add the TextView to the ScrollView
        scrollView.addView(textView);
    }
}
