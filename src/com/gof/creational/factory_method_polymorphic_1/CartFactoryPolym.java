package com.gof.creational.factory_method_polymorphic_1;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.Cart;
import com.gof.creational.common.PayPalPayment;

public class CartFactoryPolym extends AbstractOrderFactoryPolymorphic {
    @Override
    protected AbstractOrder factoryMethod() {
        Cart cart = new Cart();
        cart.setPayment(new PayPalPayment());
        return cart;
    }
}
