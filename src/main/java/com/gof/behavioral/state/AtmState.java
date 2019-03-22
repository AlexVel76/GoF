package com.gof.behavioral.state;

public interface AtmState {
    public void withdraw(int amount);
    public void refill(int amount);
}
