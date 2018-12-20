package com.test.gof.creational.factory_method_polymorphic;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.CreditCardPayment;
import com.test.gof.creational.common.Order;

public class OrderFactoryPolym extends AbstractOrderFactoryPolymorphic {
    @Override
    protected AbstractOrder build() {
        Order order = new Order();
        order.setPayment(new CreditCardPayment());
        return order;
    }
}
