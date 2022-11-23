package com.example.mathquiz;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Generator generator = new Generator();
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /*@Test
    public void test1() {
        int a = generator.getRandom(10,-10);
        assert(-10<= a && a <=10);
    }
    //@Test
    public void test2() {
        for(int i = 0; i<10;i++){
            int a = generator.getRandom(10,-10);
            int b = generator.getRandom(10,-10);
            assert(a!=b);
        }

    }*/
}