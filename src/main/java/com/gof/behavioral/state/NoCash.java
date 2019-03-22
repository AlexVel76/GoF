package com.gof.behavioral.state;

public class NoCash implements AtmState {
    Atm atm;

    public NoCash(Atm atm) {
        this.atm = atm;
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Out of cash");
    }

    @Override
    public void refill(int amount) {
        System.out.println("atm loaded:" + amount);
        atm.setState(new Working(atm));
    }
}
