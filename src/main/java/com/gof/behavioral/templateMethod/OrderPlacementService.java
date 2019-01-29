package com.gof.behavioral.templateMethod;

import com.gof.PaymentType;

public abstract class OrderPlacementService {
    public final String placeOrder(){
        String prepareResult = prepareOrder();
        PaymentType payResult = pay();

        return prepareResult + " " + payResult;
    }

    //abstract preparation
    protected abstract PaymentType pay();

    //default preparation
    protected String prepareOrder() {
        return "prepared order";
    }
}
