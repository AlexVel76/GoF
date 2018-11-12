package com.test.gof.creational.abstract_factory.pay_product;

public interface PayPalService {
    String getConnectionToPayServer();
    public String charge();
}
