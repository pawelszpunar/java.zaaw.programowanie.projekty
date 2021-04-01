package com.sda.zdjavapol68.example.zad3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("Java", 18,
                "C", 9,
                "Python", 1,
                "JavaScript", 0,
                "PHP", 0);
        print(map);
    }

    private static void print(Map<String, Integer> map) {
        int i = 0;
        System.out.println(map.entrySet().stream()
                .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                .collect(Collectors.joining()));



        //++i == map.size() ? "." : ","


        //map.forEach((s, integer) -> System.out.println("Klucz: " + s + ", Wartość: " + integer + ","));
 /*
        int i = 0;

       for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(++i == map.size()) {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
            } else {
                System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
            }
        }*/


    }
}
