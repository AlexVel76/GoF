package com.gof.behavioral.state;

public class Client {

    public static void main(String[] args) {
        Atm atm = new Atm();

        atm.refill(100);
        atm.withdraw(20);
    }
}
