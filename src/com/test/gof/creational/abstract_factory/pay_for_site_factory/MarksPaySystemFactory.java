package com.test.gof.creational.abstract_factory.pay_for_site_factory;

import com.test.gof.creational.abstract_factory.PayFactory;
import com.test.gof.creational.abstract_factory.pay_product.CreditCardService;
import com.test.gof.creational.abstract_factory.pay_product.MarksCreditCardServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.MarksPayPalServiceImpl;
import com.test.gof.creational.abstract_factory.pay_product.PayPalService;

public class MarksPaySystemFactory extends PayFactory {
    @Override
    public CreditCardService getCreditCardService() {
        return new MarksCreditCardServiceImpl();
    }

    @Override
    public PayPalService getPayPalService() {
        return new MarksPayPalServiceImpl();
    }
}
