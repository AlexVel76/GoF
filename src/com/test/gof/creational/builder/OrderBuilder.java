package com.test.gof.creational.builder;

import java.util.List;

public interface OrderBuilder {
    OrderBuilder createEntries(List<String> entries);
    OrderBuilder createPayment(String payment);
    OrderBuilder createUser(String user);
    AbstractOrder build();

}
