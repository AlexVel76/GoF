package com.gof.creational.prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrototypeTest {

    public static final String ORDER_UID_1 = "order uid 1";
    public static final String ORDER_UID_2 = "order uid 2";
    public static final String HCF_UID_1 = "HCF uid1";
    public static final String HCF_UID_2 = "HCF uid2";

    @Test
    void prototypeTest() throws CloneNotSupportedException{
        Order order1 = new Order(new HardCreatedField("many field initialyze", HCF_UID_1));
        order1.setId(ORDER_UID_1);

        Order order2 = (Order) order1.clone();
        order2.setId(ORDER_UID_2);
        order2.getHardCreatedField().setUniqueField(HCF_UID_2);

        assertTrue(order1 != order2);
        assertTrue(order1.getHardCreatedField() != order2.getHardCreatedField());

        assertEquals(ORDER_UID_1, order1.getId());
        assertEquals(ORDER_UID_2, order2.getId());

        assertEquals(HCF_UID_1, order1.getHardCreatedField().getUniqueField());
        assertEquals(HCF_UID_2, order2.getHardCreatedField().getUniqueField());

        assertEquals(order1.getHardCreatedField().getManyFieldsHere(), order2.getHardCreatedField().getManyFieldsHere());
    }
}
