package com.gof.structural.decorator.paymentSystem;

import com.gof.structural.decorator.Service;
import com.gof.structural.decorator.SiteServiceDecor;

public class CreditCardPaymentServiceImpl extends SiteServiceDecor {

    public CreditCardPaymentServiceImpl(Service service) {
        super(service);
    }

    @Override
    public void activate() {
        super.activate();
        System.out.println("- Add CreditCard payment system");
    }
}
