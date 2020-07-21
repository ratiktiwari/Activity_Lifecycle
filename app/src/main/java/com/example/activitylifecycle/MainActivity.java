package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.buttonGuess);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowGuess.class);

                intent.putExtra("guess", "Hello There");

//                startActivity(new Intent(MainActivity.this, ShowGuess.class));  //can do this way too
                startActivity(intent);
            }
        });

//        Toast.makeText(MainActivity.this, "onCreate() Called", Toast.LENGTH_SHORT).show();
//        Log.i("Cycle","onCreate()");
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(MainActivity.this, "onStart() Called", Toast.LENGTH_SHORT).show();
//        Log.i("Cycle","onStart()");
//    }
//
//    @Override
//    protected void onResume() {   // onPostResume() and onResume() is the same thing essentially
//        super.onResume();
//        Toast.makeText(MainActivity.this, "onResume() Called", Toast.LENGTH_SHORT).show();
//        Log.i("Cycle","onResume()");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(MainActivity.this, "onPause() Called", Toast.LENGTH_SHORT).show();
//        Log.i("Cycle","onPause()");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(MainActivity.this, "onStop() Called", Toast.LENGTH_SHORT).show();
//        Log.i("Cycle","onStop()");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(MainActivity.this, "onDestroy() Called", Toast.LENGTH_SHORT).show();
//        Log.i("Cycle","onDestroy()");
//    }


}