package com.gof.structural.decorator.site;

import com.gof.creational.common.AbstractOrder;
import com.gof.structural.decorator.Service;

//our main product 2, it can have different combination of email and payment systems
public class SiteTwoService implements Service {
    @Override
    public void activate() {
        System.out.println(" Site Two has been activated");
    }
}