package com.gof.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.makePayment(new CardPaymentStrategy());
        order.makePayment(new PayPalStrategy());
    }
}
