package com.test.gof.creational.abstract_factory.pay_product;

public class MarksPayPalServiceImpl implements PayPalService{
    @Override
    public String getConnectionToPayServer() {
        return "Marks Pay Pal connection";
    }

    @Override
    public String charge() {
        return "Marks Pay Pal charging";
    }
}
