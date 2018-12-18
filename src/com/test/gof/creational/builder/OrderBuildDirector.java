package com.test.gof.creational.builder;

import java.util.List;

public class OrderBuildDirector {
    private OrderBuilder orderBuilder;

    public OrderBuildDirector(OrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public AbstractOrder construct(List<String> entries, String user, String payment){
        return orderBuilder.createEntries(entries).createUser(user).createPayment(payment).build();
    }
}
