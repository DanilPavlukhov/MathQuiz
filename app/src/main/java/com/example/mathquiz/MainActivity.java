package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView problem;
    TextView text4;
    TextView text2;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        getRandom(142,5);
        getRandom(123,500);
        getRandom(134,-5);
        getRandom(1345,5);
        getRandom(14343,5);
    }
    private void setupUI(){
        problem = findViewById(R.id.problem);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);


    }
    private int getRandom(int max,int min){
        int random = (int)(Math.random()*(max - min) + min);
        Log.d("DEBUGGER_TAG","max: " + max + " min: " + min + " Random: " + random);
        return random;
    }

}