package com.gof.creational.builder;

import java.util.List;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.PaymentSystem;

public interface OrderBuilder {
    OrderBuilder createEntries(List<String> entries);
    OrderBuilder createPayment(PaymentSystem paymentSystem);
    OrderBuilder createUser(String user);
    AbstractOrder build();

}
