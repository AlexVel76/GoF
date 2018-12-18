package com.test.gof.creational.builder;

import java.util.List;

public class OrderBuilderImpl implements OrderBuilder {
    AbstractOrder order = new Order();

    @Override
    public OrderBuilder createEntries(List<String> entries) {
        order.setEntities(entries);
        return this;
    }

    @Override
    public OrderBuilder createPayment(String payment) {
        order.setPayment(payment);
        return this;
    }

    @Override
    public OrderBuilder createUser(String user) {
        order.setUser(user);
        return this;
    }

    @Override
    public AbstractOrder build() {
        return order;
    }
}
