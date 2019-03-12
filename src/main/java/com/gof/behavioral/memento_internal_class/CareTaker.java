package com.gof.behavioral.memento_internal_class;

import java.util.Stack;

public class CareTaker {
    private Stack<MementoSnapshot> mementoSnapshots = new Stack<>();

    public void add(MementoSnapshot mementoSnapshot) {
        mementoSnapshots.push(mementoSnapshot);
    }

    public MementoSnapshot get() {
        return mementoSnapshots.pop();
    }
}
