package com.sda.zdjavapol68.example.zad37;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable run1 = new ThreadPlaygroundRunnable("A1");

        for(int i = 0; i < 10; i++) {
            executorService.execute(new ThreadPlaygroundRunnable("A " + i));
        }

        //executorService.


    }
}
