package com.sda.zdjavapol68.example.zad37;

public class ThreadPlaygroundRunnable implements Runnable{

    private String name;

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " -> " + Thread.currentThread().getName() + ", " + name);
        }
    }

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }
}
