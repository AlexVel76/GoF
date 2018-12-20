package com.test.gof.creational.builder;

import java.util.List;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.PaymentSystem;

public interface OrderBuilder {
    OrderBuilder createEntries(List<String> entries);
    OrderBuilder createPayment(PaymentSystem paymentSystem);
    OrderBuilder createUser(String user);
    AbstractOrder build();

}
