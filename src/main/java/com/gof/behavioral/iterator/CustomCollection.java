package com.gof.behavioral.iterator;

import java.util.Iterator;

public interface CustomCollection {
    public CustomIterator getIterator();
    public void insert(int val);
    public int size();
}
