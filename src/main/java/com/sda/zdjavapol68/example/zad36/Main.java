package com.sda.zdjavapol68.example.zad36;

public class Main {

    private static Thread thread1;
    private static Thread thread2;

    public static void main(String[] args) {

        //to jest moje
        //dopisac co napisał trener!!

        thread1 = new Thread(new ThreadPlaygroundRunnable("-AA-"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("-BB-"));
        thread1.start();
        thread2.start();

    }
}
