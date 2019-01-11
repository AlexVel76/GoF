package com.gof.creational.abstract_factory;

import com.gof.creational.SiteType;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        callTestMethods(SiteType.SITE2);
        callTestMethods(SiteType.SITE1);
    }

    private static void callTestMethods(final SiteType site) {
        PayFactory payFactory = PayFactory.getFactory(site);
        System.out.println(payFactory.getCreditCardService().getConnectionToPayServer());
        System.out.println(payFactory.getCreditCardService().charge());
        System.out.println(payFactory.getPayPalService().getConnectionToPayServer());
        System.out.println(payFactory.getPayPalService().charge());
    }
}
