package com.test.gof.creational.common;

public class PayPalPayment implements PaymentSystem {
    @Override
    public String getType() {
        return "PayPal";
    }
}
