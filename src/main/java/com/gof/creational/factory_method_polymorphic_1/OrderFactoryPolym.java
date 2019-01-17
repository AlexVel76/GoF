package com.gof.creational.factory_method_polymorphic_1;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.CreditCardPayment;
import com.gof.creational.common.Order;

public class OrderFactoryPolym extends AbstractOrderFactoryPolymorphic {
    @Override
    protected AbstractOrder factoryMethod() {
        Order order = new Order();
        order.setPayment(new CreditCardPayment());
        return order;
    }
}
