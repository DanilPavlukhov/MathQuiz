package com.example.mathquiz;

import android.util.Log;

public class Generator {
    int result;
    public String getProblem(){
        int a = getRandom(-50,50);
        int b = getRandom(-50,50);
        result = a + b ;
        return a +  " + "  +  b + " = ";

    }
    public  String getResult(){return String.valueOf(result); }
    public String getNoiseResult(){
        return String.valueOf(result + getRandom(5,10));
    }
    public int getRandom(int max,int min){
        int random = 0;
        while(random == 0) {
            random = (int) (Math.random() * (max - min) + min);
        }
        return random;
    }
}
