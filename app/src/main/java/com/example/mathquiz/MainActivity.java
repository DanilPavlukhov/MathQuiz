package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity{

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
        MyClicker myClicker =new  MyClicker();
        problem = findViewById(R.id.problem);
        text1 = findViewById(R.id.text1);
        text1.setOnClickListener(myClicker);
        text2 = findViewById(R.id.text2);
        text2.setOnClickListener(myClicker);
        text3 = findViewById(R.id.text3);
        text3.setOnClickListener(myClicker);

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

    public class MyClicker implements View.OnClickListener {
        @SuppressLint("ResourceAsColor")
        @Override
        public void onClick(View v) {
            TextView tw = (TextView) v;
            String str  = tw.getText().toString();
            if(str.equals(generator.getResult())) {
                v.setBackgroundColor(R.color.teal_700);
            } else
                v.setBackgroundColor(R.color.red);
        }
    }



}