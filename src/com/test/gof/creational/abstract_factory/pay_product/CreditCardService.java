package com.test.gof.creational.abstract_factory.pay_product;

public interface CreditCardService {
    String getConnectionToPayServer();
    String charge();
}
