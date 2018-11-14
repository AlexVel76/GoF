package com.test.gof.creational.abstract_factory.pay_for_site_factory;

import com.test.gof.creational.abstract_factory.PayFactory;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.test.gof.creational.abstract_factory.pay_product.CompanyTwoCreditCardServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.CompanyTwoPayPalServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.PayPalService;

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
