package com.test.gof.creational.abstract_factory.pay_product;

public class CompanyTwoPayPalServiceImpl implements PayPalService{
    @Override
    public String getConnectionToPayServer() {
        return "CompanyTwo Pay Pal connection";
    }

    @Override
    public String charge() {
        return "CompanyTwo Pay Pal charging";
    }
}
