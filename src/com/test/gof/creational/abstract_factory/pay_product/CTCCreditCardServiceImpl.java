package com.test.gof.creational.abstract_factory.pay_product;

public class CTCCreditCardServiceImpl implements CreditCardService {

    @Override
    public String getConnectionToPayServer() {
        return "CTC connection to Credit Card";
    }

    @Override
    public String charge() {
        return "CTC credit card charging";
    }
}
