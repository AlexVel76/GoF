package com.test.gof.creational.abstract_factory.pay_product;

public class CompanyOnePayPalServiceImpl implements PayPalService {
    @Override
    public String getConnectionToPayServer() {
        return "CompanyOne Pay Pal connection";
    }

    @Override
    public String charge() {
        return "charge CompanyOne from Pay Pal";
    }
}
