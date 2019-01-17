package com.gof.creational.common;

import com.gof.PaymentType;

public class CreditCardPayment implements PaymentSystem {
    @Override
    public PaymentType getType() {
        return PaymentType.CREDITCARD;
    }
}
