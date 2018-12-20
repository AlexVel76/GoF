package com.test.gof.creational.builder;

import java.util.List;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.PaymentSystem;

public class OrderBuildDirector {
    private OrderBuilder orderBuilder;

    public OrderBuildDirector(OrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public AbstractOrder construct(List<String> entries, String user, PaymentSystem payment){
        return orderBuilder.createEntries(entries).createUser(user).createPayment(payment).build();
    }
}
