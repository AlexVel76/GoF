package com.test.gof.creational.abstract_factory.pay_product;

public class MarksCreditCardServiceImpl implements CreditCardService {
    @Override
    public String getConnectionToPayServer() {
        return "Marks connection to Credit Card";
    }

    @Override
    public String charge() {
        return "Marks credit card charging";
    }
}
