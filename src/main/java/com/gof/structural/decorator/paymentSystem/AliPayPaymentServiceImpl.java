package com.gof.structural.decorator.paymentSystem;

import com.gof.structural.decorator.Service;
import com.gof.structural.decorator.SiteServiceDecor;

public class AliPayPaymentServiceImpl extends SiteServiceDecor {

    public AliPayPaymentServiceImpl(Service service) {
        super(service);
    }

    @Override
    public void activate() {
        System.out.print("- Add Aliexpress payment system");
        super.activate();
    }
}
