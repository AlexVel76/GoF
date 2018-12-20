package com.gof.creational.factory_method_polymorphic_1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.Cart;
import com.gof.creational.common.CreditCardPayment;
import com.gof.creational.common.Order;
import com.gof.creational.common.PayPalPayment;

class FactoryMethodPolymorphicTest {

    @Test
    void getAbstractOrder() {
        AbstractOrderFactoryPolymorphic orderFactory = new OrderFactoryPolym();
        AbstractOrder result = orderFactory.getAbstractOrder("user1");
        assertTrue(result instanceof Order);
        assertTrue(result.getPayment() instanceof CreditCardPayment);

        AbstractOrderFactoryPolymorphic cartFactoryPolym = new CartFactoryPolym();
        result = cartFactoryPolym.getAbstractOrder("user1");
        assertTrue(result instanceof Cart);
        assertTrue(result.getPayment() instanceof PayPalPayment);
    }
}