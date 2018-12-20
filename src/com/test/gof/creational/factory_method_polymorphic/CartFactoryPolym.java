package com.test.gof.creational.factory_method_polymorphic;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.Cart;
import com.test.gof.creational.common.PayPalPayment;

public class CartFactoryPolym extends AbstractOrderFactoryPolymorphic {
    @Override
    protected AbstractOrder build() {
        Cart cart = new Cart();
        cart.setPayment(new PayPalPayment());
        return cart;
    }
}
