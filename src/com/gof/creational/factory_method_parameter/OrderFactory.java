package com.gof.creational.factory_method_parameter;

import com.gof.creational.common.AbstractOrder;
import com.gof.creational.common.Cart;
import com.gof.creational.common.CreditCardPayment;
import com.gof.creational.common.PayPalPayment;
import com.gof.creational.common.Order;
import com.gof.creational.common.OrderType;

public class OrderFactory {
    public AbstractOrder getAbstractOrder(OrderType type) throws UnsupportedOperationException{
        AbstractOrder result = null;

        switch (type) {
            case ORDER:
                result = new Order();
                result.setPayment(new CreditCardPayment());
                break;
            case CART:
                result = new Cart();
                result.setPayment(new PayPalPayment());
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return result;
    }
}
