package com.gof.structural.adapter;

import com.gof.PaymentType;

public class Client {
    public static void main(String[] args) {

        //using old interface with only one method
        OldPaymentService oldPaymentService = new OldPaymentServiceImpl();
        System.out.println(oldPaymentService.pay(PaymentType.CREDITCARD));
        System.out.println(oldPaymentService.pay(PaymentType.PAYPAL));

        //using of new interface with two different methods
        PaymentServiceAdapter paymentServiceAdapter = new PaymentServiceAdapter();
        System.out.println(paymentServiceAdapter.payCreditCard());
        System.out.println(paymentServiceAdapter.payPayPal());
    }
}
