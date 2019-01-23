package com.gof.structural.decorator.emailProviders;

import com.gof.structural.decorator.Service;
import com.gof.structural.decorator.SiteServiceDecor;

public class GoogleMail extends SiteServiceDecor {

    public GoogleMail(Service service) {
        super(service);
    }

    @Override
    public void activate() {
        super.activate();
        System.out.print("- Add GoogleMail Provider");
    }
}