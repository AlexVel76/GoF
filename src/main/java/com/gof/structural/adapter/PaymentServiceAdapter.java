package com.gof.structural.adapter;

import com.gof.PaymentType;

public class PaymentServiceAdapter implements NewPaymentService {
    private OldPaymentService oldPaymentService = new OldPaymentServiceImpl();

    @Override
    public String payCreditCard() {
        return oldPaymentService.pay(PaymentType.CREDITCARD);
    }

    @Override
    public String payPayPal() {
        return oldPaymentService.pay(PaymentType.PAYPAL);
    }
}
