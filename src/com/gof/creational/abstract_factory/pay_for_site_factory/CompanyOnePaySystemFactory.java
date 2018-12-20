package com.gof.creational.abstract_factory.pay_for_site_factory;

import com.gof.creational.abstract_factory.pay_product.CompanyOneCreditCardServiceImpl;
import com.gof.creational.abstract_factory.pay_product.PayPalService;
import com.gof.creational.abstract_factory.PayFactory;
import com.gof.creational.abstract_factory.pay_product.CompanyOnePayPalServiceImpl;
import com.gof.creational.abstract_factory.pay_product.CreditCardService;

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
