package com.gof.creational.abstract_factory.pay_for_site_factory;

import com.gof.creational.abstract_factory.pay_product.PayPalService;
import com.gof.creational.abstract_factory.PayFactory;
import com.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.gof.creational.abstract_factory.pay_product.CompanyTwoCreditCardServiceImpl;
import com.gof.creational.abstract_factory.pay_product.CompanyTwoPayPalServiceImpl;

public class CompanyTwoPaySystemFactory extends PayFactory {
    @Override
    public CreditCardService getCreditCardService() {
        return new CompanyTwoCreditCardServiceImpl();
    }

    @Override
    public PayPalService getPayPalService() {
        return new CompanyTwoPayPalServiceImpl();
    }
}
