package com.gof.structural.adapter;

import com.gof.PaymentType;

public class OldPaymentServiceImpl implements OldPaymentService {

    @Override
    public String pay(PaymentType paymentType) {
        switch (paymentType) {
            case PAYPAL:
                return PaymentType.PAYPAL.name();
            case CREDITCARD:
                return PaymentType.CREDITCARD.name();
            default:
                return PaymentType.UNDEFINED.name();
        }
    }
}
