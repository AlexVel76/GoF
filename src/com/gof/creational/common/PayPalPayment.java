package com.gof.creational.common;

import com.gof.PaymentType;

public class PayPalPayment implements PaymentSystem {
    @Override
    public PaymentType getType() {
        return PaymentType.PAYPAL;
    }
}
