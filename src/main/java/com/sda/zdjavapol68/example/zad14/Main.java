package com.sda.zdjavapol68.example.zad14;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final int BOUND = 250_000;
    public static void main(String[] args) {
        int[] array = new int[100_000];





        fill(array);

        List<Integer> distinct = getDistinct(array);

        List<Integer> duplicates = getDuplicated(array);
        System.out.println(duplicates.size());

        List<Integer> top = getTop(array);





    }

    private static void fill(int[] array) {
        Random generator = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(BOUND);
            //array.add(generator.nextDouble()*10);
        }
        //System.out.println(array[6]);
    }

    private static List<Integer> getDistinct(int[] array) {

        //dopisz drugi sposób
        //

        return Arrays.stream(array).distinct().boxed().collect(Collectors.toList());
    }

    private static List<Integer> getDuplicated(int[] array) {

//        Set<Integer> helperSet = new HashSet<>();
//        Arrays.stream(array).filter(i -> !helperSet.add(i)).boxed().collect(Collectors.toList());




        Set<Integer> set = new HashSet<>();
        List<Integer> myList = new ArrayList<>();
        for (int i : array) {
            if(!set.add(i)) {
                myList.add(i);
            }
        }
        return myList;

//
//        Set<Integer> setList = new HashSet<>();
//        List<Integer> repeatedElements = new ArrayList<>();
//        Arrays.stream(tab).forEach(el->{
//            if(!setList.add(el)){
//                repeatedElements.add(el);
//            }
//        });
//
//        return repeatedElements;


    }

    private static List<Integer> getTop(int[] array) {
        Map<Integer, Integer> counters = new HashMap<>();
        for (int i : array) {
            if(counters.containsKey(i)) {
                int tempInt = counters.get(i) + 1;
                counters.put(i, tempInt);
            } else {
                counters.put(i, 1);
            }
        }

        // ????
        return null;
    }

    public static void fixDuplicates(int[] array) {
        Random random = new Random();
        Set<Integer> helperSet = new HashSet<>();


        for(int i = 0; i < array.length; i++) {
            if(!helperSet.add(array[i])) {
                int candidate = random.nextInt(BOUND);
                while(!helperSet.add(candidate)) {
                    candidate = random.nextInt(BOUND);
                }
                array[i] = candidate;
            }
        }
    }
}