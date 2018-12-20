package com.test.gof.creational.factory_method_polymorphic;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.Cart;
import com.test.gof.creational.common.CreditCardPayment;
import com.test.gof.creational.common.Order;
import com.test.gof.creational.common.OrderType;
import com.test.gof.creational.common.PayPalPayment;
import com.test.gof.creational.factory_method_parameter.OrderFactory;

class FactoryMethodPolymorphicTest {

    @Test
    void getAbstractOrder() {
        OrderFactoryPolym orderFactory = new OrderFactoryPolym();
        AbstractOrder result = orderFactory.getAbstractOrder();
        assertTrue(result instanceof Order);
        assertTrue(result.getPayment() instanceof CreditCardPayment);

        CartFactoryPolym cartFactoryPolym = new CartFactoryPolym();
        result = cartFactoryPolym.getAbstractOrder();
        assertTrue(result instanceof Cart);
        assertTrue(result.getPayment() instanceof PayPalPayment);
    }
}