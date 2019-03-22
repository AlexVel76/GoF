package com.gof.behavioral.strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Card Payment");
    }
}
