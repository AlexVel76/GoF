package com.gof.structural.bridge.paymentSystem;

import com.gof.PaymentType;
import com.gof.creational.common.AbstractOrder;

public class PayPalPaymentServiceImpl implements PaymentService {
    @Override
    public PaymentType pay(AbstractOrder abstractOrder) {
        System.out.println("pay order by PayPal");
        return PaymentType.PAYPAL;
    }
}
