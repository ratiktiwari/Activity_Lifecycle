package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showGuess;
    private EditText enterGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.buttonGuess);
        enterGuess = findViewById(R.id.editTextEnterGuess);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String guess = enterGuess.getText().toString().trim();

                //Trim is used for below:
                //Input :  str = "   Hello World   "
                //Output : str = "Hello World"
                //
                //Input :  str = "      Hey  there    Joey!!!      "
                //Output : str = "Hey  there    Joey!!!"


                //We can eliminate the leading and trailing spaces of a string in Java with the help of trim().
                //trim() method is defined under the String class of java.lang package.
                //It does not eliminated the middle spaces of the string.
                //By calling the trim() method, a new String object is returned.
                //It doesn’t replace the value of String object. Therefore if we want the access to the new String object, we just need to reassign it to the old String or assign it to a new variable.

                if(!guess.isEmpty())
                {

                    Intent intent = new Intent(MainActivity.this, ShowGuess.class);

                    intent.putExtra("guess", guess);
                    intent.putExtra("Name", "Ratik");
                    intent.putExtra("Age", 20);

//                startActivity(new Intent(MainActivity.this, ShowGuess.class));  //can do this way too
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Enter Guess!", Toast.LENGTH_SHORT).show();
                }
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