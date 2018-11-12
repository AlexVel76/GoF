package com.test.gof.creational.abstract_factory;

import com.test.gof.creational.abstract_factory.pay_for_site_factory.CTCPaySystemFactory;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        callTestMethods("marks");
        callTestMethods("ctc");
    }

    private static void callTestMethods(final String site) {
        PayFactory payFactory = PayFactory.getFactory(site);
        System.out.println(payFactory.getCreditCardService().getConnectionToPayServer());
        System.out.println(payFactory.getCreditCardService().charge());
        System.out.println(payFactory.getPayPalService().getConnectionToPayServer());
        System.out.println(payFactory.getPayPalService().charge());
    }
}
