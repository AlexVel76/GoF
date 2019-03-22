package com.gof.behavioral.state;

public class Working implements AtmState {
    Atm atm;

    public Working(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw:" + amount);
    }

    @Override
    public void refill(int amount) {
        System.out.println(amount + " is loaded");
    }
}
