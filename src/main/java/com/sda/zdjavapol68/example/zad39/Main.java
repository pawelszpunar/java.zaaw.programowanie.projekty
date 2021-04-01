package com.sda.zdjavapol68.example.zad39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        AtomicInteger score = new AtomicInteger(0);


        ExecutorService screenPool = Executors.newFixedThreadPool(100);
        int screens = 100;
        for(int i = 0; i < screens; i++) {
            screenPool.execute(() -> System.out.println(score.get()));
        }
        int sensors = 5
        ExecutorService sensorPool = Executors.newFixedThreadPool(sensors);


    }
}
