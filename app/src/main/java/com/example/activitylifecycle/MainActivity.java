package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "onCreate() Called", Toast.LENGTH_SHORT).show();
        Log.i("Cycle","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart() Called", Toast.LENGTH_SHORT).show();
        Log.i("Cycle","onStart()");
    }

    @Override
    protected void onResume() {   // onPostResume() and onResume() is the same thing essentially
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume() Called", Toast.LENGTH_SHORT).show();
        Log.i("Cycle","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause() Called", Toast.LENGTH_SHORT).show();
        Log.i("Cycle","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop() Called", Toast.LENGTH_SHORT).show();
        Log.i("Cycle","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy() Called", Toast.LENGTH_SHORT).show();
        Log.i("Cycle","onDestroy()");
    }



}