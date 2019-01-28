package com.gof.structural.flyweight;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.PostConstruct;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.gof.creational.common.Cart;
import com.gof.creational.common.PayPalPayment;

class MyObjectWraperTest {

    public static final String ITEM_3 = "item3";
    public static final String NEWVALUE = "newvalue";

    @Test
    public void test() {
        for (int i = 0; i < 5; i++) {
            MyObjectWraper.valueOf("item" + i);
        }

        assertEquals(MyObjectWraper.pool.size(), 5);

        MyObject item3 = MyObjectWraper.valueOf(ITEM_3);
        assertNotNull(item3);
        assertEquals(item3.getName(), ITEM_3);
        assertEquals(MyObjectWraper.pool.size(), 5);

        MyObject newValue = MyObjectWraper.valueOf(NEWVALUE);
        assertNotNull(newValue);
        assertEquals(newValue.getName(), NEWVALUE);
        assertEquals(MyObjectWraper.pool.size(), 6);
    }

}