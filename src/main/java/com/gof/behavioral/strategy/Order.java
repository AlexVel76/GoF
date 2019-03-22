package com.gof.behavioral.strategy;

public class Order {
    public void makePayment(PaymentStrategy  paymentStrategy)
    {
        paymentStrategy.pay();
    }
}
