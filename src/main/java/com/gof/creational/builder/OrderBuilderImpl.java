package com.gof.creational.builder;

import java.util.List;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.PaymentSystem;
import com.gof.creational.common.Order;

public class OrderBuilderImpl implements OrderBuilder {
    AbstractOrder order = new Order();

    @Override
    public OrderBuilder createEntries(List<String> entries) {
        order.setEntities(entries);
        return this;
    }

    @Override
    public OrderBuilder createPayment(PaymentSystem paymentSystem) {
        order.setPayment(paymentSystem);
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
