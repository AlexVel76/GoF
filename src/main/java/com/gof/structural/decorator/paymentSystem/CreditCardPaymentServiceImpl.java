package com.gof.structural.decorator.paymentSystem;

import com.gof.structural.decorator.Service;
import com.gof.structural.decorator.SiteServiceDecor;

public class CreditCardPaymentServiceImpl extends SiteServiceDecor {

    public CreditCardPaymentServiceImpl(Service service) {
        super(service);
    }

    @Override
    public void activate() {
        System.out.print("- Add CreditCard payment system");
        super.activate();
    }
}
