package com.gof.structural.bridge;

import com.gof.PaymentType;
import com.gof.creational.common.AbstractOrder;
import com.gof.structural.bridge.paymentSystem.PaymentService;

public abstract class AbstractSiteService {
    private PaymentService paymentService;

    public AbstractSiteService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    abstract AbstractOrder pay(AbstractOrder abstractOrder);
}
