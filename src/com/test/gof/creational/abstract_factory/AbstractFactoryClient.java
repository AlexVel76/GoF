package com.test.gof.creational.abstract_factory;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        callTestMethods("CompanyTwo");
        callTestMethods("CompanyOne");
    }

    private static void callTestMethods(final String site) {
        PayFactory payFactory = PayFactory.getFactory(site);
        System.out.println(payFactory.getCreditCardService().getConnectionToPayServer());
        System.out.println(payFactory.getCreditCardService().charge());
        System.out.println(payFactory.getPayPalService().getConnectionToPayServer());
        System.out.println(payFactory.getPayPalService().charge());
    }
}
