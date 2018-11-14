package com.test.gof.creational.abstract_factory.pay_product;

public class CompanyOneCreditCardServiceImpl implements CreditCardService {

    @Override
    public String getConnectionToPayServer() {
        return "CompanyOne connection to Credit Card";
    }

    @Override
    public String charge() {
        return "CompanyOne credit card charging";
    }
}
