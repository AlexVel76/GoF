package com.gof.creational.builder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.Cart;
import com.gof.creational.common.CreditCardPayment;
import com.gof.creational.common.PayPalPayment;
import com.gof.creational.common.Order;

class BuilderTest {

    public static final String CREDIT_CARD = "credit card";
    public static final String USER_2 = "user2";
    public static final String USER_1 = "user1";
    public static final String PAYPAL = "PayPal";

    @Test
    void construct() {
        OrderBuildDirector orderBuildDirector = new OrderBuildDirector(new CartBuilderImpl());

        List<String> entities = new ArrayList<>();
        entities.add("prod1");
        entities.add("prod2");
        AbstractOrder abstractOrder = orderBuildDirector.construct(entities, USER_1, new PayPalPayment());

        assertTrue(abstractOrder instanceof Cart);
        assertEquals(USER_1,  abstractOrder.getUser());
        assertEquals(PAYPAL,  abstractOrder.getPayment().getType());
        assertArrayEquals(new String[]{"prod1", "prod2"}, abstractOrder.getEntities().toArray());

        orderBuildDirector = new OrderBuildDirector(new OrderBuilderImpl());
        abstractOrder = orderBuildDirector.construct(entities, USER_2, new CreditCardPayment());
        assertTrue(abstractOrder instanceof Order);
        assertEquals(USER_2,  abstractOrder.getUser());
        assertEquals(CREDIT_CARD,  abstractOrder.getPayment().getType());
        assertArrayEquals(new String[]{"prod1", "prod2"}, abstractOrder.getEntities().toArray());

    }
}