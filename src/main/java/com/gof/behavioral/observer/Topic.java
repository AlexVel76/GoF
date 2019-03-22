package com.gof.behavioral.observer;

public interface Topic {
    public void register(Observer observer);
    public void notifyObservers(String str);
}
