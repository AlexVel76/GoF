package com.gof.creational.factory_method_parameter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.gof.creational.common.CreditCardPayment;
import com.gof.creational.common.PayPalPayment;
import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.Cart;
import com.gof.creational.common.Order;
import com.gof.creational.common.OrderType;

class FactoryMethodParameterTest {

    @Test
    void getAbstractOrder() {
        OrderFactory orderFactory = new OrderFactory();
        AbstractOrder result = orderFactory.getAbstractOrder(OrderType.ORDER);
        assertTrue(result instanceof Order);
        assertTrue(result.getPayment() instanceof CreditCardPayment);

        result = orderFactory.getAbstractOrder(OrderType.CART);
        assertTrue(result instanceof Cart);
        assertTrue(result.getPayment() instanceof PayPalPayment);
    }
}