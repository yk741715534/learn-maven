package com.qyf404.learn.maven;

import java.util.Random;

public class App {

    public int add(int a, int b) {
        boolean tag = new Random().nextBoolean();
        if(tag){
            a += 1;
        }else {
            a += 2;
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
