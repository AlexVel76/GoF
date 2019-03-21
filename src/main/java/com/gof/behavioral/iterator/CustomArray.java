package com.gof.behavioral.iterator;

import java.util.Collection;
import java.util.Iterator;


public class CustomArray implements CustomCollection {

    private int [] arr;
    private int leng;

    public CustomArray(int size) {
        arr = new int[size];
        leng=0;
    }

    public void pause(long i) throws InterruptedException {
        Thread.sleep(1000*2);
    }

    @Override
    public CustomIterator getIterator() {
        return new CustomArrayIterator(arr, leng);
    }

    @Override
    public void insert(int val) {
        arr[leng++] = val;
    }

    @Override
    public int size() {
        return leng;
    }
}
