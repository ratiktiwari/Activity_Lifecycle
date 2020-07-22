package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        textview = findViewById(R.id.textView);

        Bundle extra = getIntent().getExtras();

//        if(getIntent().getStringExtra("guess")!=null)
//        {
//            textview.setText(getIntent().getStringExtra("guess"));
//        }

        if(extra!=null)
        {
            textview.setText(extra.getString("guess"));
            Log.d("Name Extra", "onCreate: " + extra.getString("Name"));
            Log.d("Age Extra", "onCreate: " + extra.getInt("Age"));
        }
    }
}