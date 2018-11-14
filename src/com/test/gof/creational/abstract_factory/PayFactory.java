package com.test.gof.creational.abstract_factory;

import com.test.gof.creational.abstract_factory.pay_for_site_factory.CompanyOnePaySystemFactory;
import com.test.gof.creational.abstract_factory.pay_for_site_factory.CompanyTwoPaySystemFactory;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.test.gof.creational.abstract_factory.pay_product.PayPalService;

public abstract class PayFactory {
    private static PayFactory companyOnePayFactory = null;
    private static PayFactory companyTwoPayFactory = null;

    public abstract CreditCardService getCreditCardService();
    public abstract PayPalService getPayPalService();

    public static PayFactory getFactory(final String site) {
        PayFactory result = null;

        switch (site) {
            case "CompanyOne":
                if (companyOnePayFactory == null) {
                    companyOnePayFactory = new CompanyOnePaySystemFactory();
                    result = companyOnePayFactory;
                }
                break;
            case "CompanyTwo":
                if (companyTwoPayFactory == null) {
                    companyTwoPayFactory = new CompanyTwoPaySystemFactory();
                    result = companyTwoPayFactory;
                }
                break;
            default:
                throw new UnknownError();
        }

        return result;
    }
}
