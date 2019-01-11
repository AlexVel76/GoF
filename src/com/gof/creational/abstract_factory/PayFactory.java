package com.gof.creational.abstract_factory;

import com.gof.creational.SiteType;
import com.gof.creational.abstract_factory.pay_for_site_factory.CompanyOnePaySystemFactory;
import com.gof.creational.abstract_factory.pay_for_site_factory.CompanyTwoPaySystemFactory;
import com.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.gof.creational.abstract_factory.pay_product.PayPalService;

public abstract class PayFactory {
    private static PayFactory companyOnePayFactory = null;
    private static PayFactory companyTwoPayFactory = null;

    public abstract CreditCardService getCreditCardService();
    public abstract PayPalService getPayPalService();

    public static PayFactory getFactory(final SiteType site) {
        PayFactory result = null;

        switch (site) {
            case SITE1:
                if (companyOnePayFactory == null) {
                    companyOnePayFactory = new CompanyOnePaySystemFactory();
                    result = companyOnePayFactory;
                }
                break;
            case SITE2:
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
