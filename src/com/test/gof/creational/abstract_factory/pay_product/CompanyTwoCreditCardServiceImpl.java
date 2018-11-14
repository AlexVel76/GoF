package com.test.gof.creational.abstract_factory.pay_product;

public class CompanyTwoCreditCardServiceImpl implements CreditCardService {
    @Override
    public String getConnectionToPayServer() {
        return "CompanyTwo connection to Credit Card";
    }

    @Override
    public String charge() {
        return "CompanyTwo credit card charging";
    }
}
