package com.test.gof.creational.factory_method_polymorphic;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.Cart;
import com.test.gof.creational.common.Order;
import com.test.gof.creational.common.OrderType;
import com.test.gof.creational.common.PaymentSystem;

public abstract class AbstractOrderFactoryPolymorphic {

    public AbstractOrder getAbstractOrder(){
        return build();
    }

    protected abstract AbstractOrder build();
}
