package com.gof.behavioral.iterator;

public class CustomArrayIterator implements CustomIterator {
    private int[] arr;
    private int leng;
    private int pos;


    public CustomArrayIterator(int[] arr, int leng) {
        this.arr = arr;
        this.leng = leng;
        pos = -1;
    }

    @Override
    public int next() {
        return arr[++pos];
    }

    @Override
    public boolean hasNext() {
        return pos+1 < leng;
    }
}
