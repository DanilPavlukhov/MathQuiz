package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;


public class MainActivity extends Activity {

    TextView problem;
    TextView text1;
    TextView text2;
    TextView text3;
    Generator generator = new Generator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        String s = generator.getProblem();
        problem.setText(s);
        generateAnswers();

    }
    private void setupUI(){

        problem = findViewById(R.id.problem);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);

    }
    private void generateAnswers(){
        Generator generator = new Generator();
        int position = generator.getRandom(1,4);
        if(position == 1) {
            text1.setText(generator.getResult());
            text2.setText(generator.getNoiseResult());
            text3.setText(generator.getNoiseResult());
        }
        if(position == 2) {
            text1.setText(generator.getNoiseResult());
            text2.setText(generator.getResult());
            text3.setText(generator.getNoiseResult());
        }
        if(position == 3) {
            text1.setText(generator.getNoiseResult());
            text2.setText(generator.getNoiseResult());
            text3.setText(generator.getResult());
        }
    }



}