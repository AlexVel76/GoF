package com.gof.behavioral.strategy;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("PayPal paymetn");
    }
}
