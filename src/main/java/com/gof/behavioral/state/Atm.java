package com.gof.behavioral.state;

public class Atm implements AtmState {
    int cahsStock;
    AtmState curentState;


    public Atm() {
        curentState = new NoCash(this);
    }

    @Override
    public void withdraw(int amount) {
        curentState.withdraw(amount);
    }

    @Override
    public void refill(int amount) {
        curentState.refill(amount);
    }

    public void setState(AtmState atmState) {
        curentState = atmState;
    }
}
