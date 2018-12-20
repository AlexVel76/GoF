package com.test.gof.creational.factory_method_parameter;

import com.test.gof.creational.common.AbstractOrder;
import com.test.gof.creational.common.Cart;
import com.test.gof.creational.common.CreditCardPayment;
import com.test.gof.creational.common.Order;
import com.test.gof.creational.common.OrderType;
import com.test.gof.creational.common.PayPalPayment;

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
