package com.gof.structural.decorator.site;

import com.gof.creational.common.AbstractOrder;
import com.gof.structural.decorator.Service;

//our main product 1
public class SiteOneService implements Service {
    @Override
    public void activate() {
        System.out.println("- Site One has been activated\r\n");
    }
}