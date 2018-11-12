package com.test.gof.creational.abstract_factory.pay_product;

public class CTCPayPalServiceImpl implements PayPalService {
    @Override
    public String getConnectionToPayServer() {
        return "CTC Pay Pal connection";
    }

    @Override
    public String charge() {
        return "charge CTC from Pay Pal";
    }
}
