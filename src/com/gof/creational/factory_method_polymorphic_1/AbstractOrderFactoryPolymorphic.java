package com.gof.creational.factory_method_polymorphic_1;

import com.gof.creational.common.AbstractOrder;

public abstract class AbstractOrderFactoryPolymorphic {

    public AbstractOrder getAbstractOrder(String user){
        AbstractOrder abstractOrder = factoryMethod();
        abstractOrder.setUser(user);
        return abstractOrder;
    }

    protected abstract AbstractOrder factoryMethod();
}
