package com.sda.zdjavapol68.example.zad28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkipArrayList<E> extends ArrayList<E> {
    //private List<E> list;

    public List<E> getEveryNthElement(int startIndex, int skip) {
        if(startIndex < 0 || startIndex >= size()) {
            return Collections.emptyList();
        }
        List<E> tempList = new ArrayList<>();
        for(int i = startIndex; i < size(); i = i + skip + 1) {
            tempList.add(get(i));
        }
        return tempList;
    }
}