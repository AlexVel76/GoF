package com.test.gof.creational.builder;

import java.util.List;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.Cart;
import com.test.gof.creational.common.PaymentSystem;

public class CartBuilderImpl implements  OrderBuilder{
    AbstractOrder cart = new Cart();

    @Override
    public OrderBuilder createEntries(List<String> entries) {
        cart.setEntities(entries);
        return this;
    }

    @Override
    public OrderBuilder createPayment(PaymentSystem payment) {
        cart.setPayment(payment);
        return this;
    }

    @Override
    public OrderBuilder createUser(String user) {
        cart.setUser(user);
        return this;
    }

    @Override
    public AbstractOrder build() {
        return cart;
    }
}
