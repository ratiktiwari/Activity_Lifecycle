package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        textview = findViewById(R.id.textView);

        if(getIntent().getStringExtra("guess")!=null)
        {
            textview.setText(getIntent().getStringExtra("guess"));
        }
    }
}