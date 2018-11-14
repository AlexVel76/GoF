package com.test.gof.creational.abstract_factory.pay_for_site_factory;

import com.test.gof.creational.abstract_factory.PayFactory;
import com.test.gof.creational.abstract_factory.pay_product.CompanyOneCreditCardServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.CompanyOnePayPalServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.test.gof.creational.abstract_factory.pay_product.PayPalService;

public class CompanyOnePaySystemFactory extends PayFactory {

    @Override
    public CreditCardService getCreditCardService() {
        return new CompanyOneCreditCardServiceImpl();
    }

    @Override
    public PayPalService getPayPalService() {
        return new CompanyOnePayPalServiceImpl();
    }
}
