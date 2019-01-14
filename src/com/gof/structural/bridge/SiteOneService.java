package com.gof.structural.bridge;

import com.gof.PaymentType;
import com.gof.creational.common.AbstractOrder;
import com.gof.structural.bridge.paymentSystem.PaymentService;

public class SiteOneService extends AbstractSiteService {

    public SiteOneService(PaymentService paymentService) {
        super(paymentService);
    }

    @Override
    AbstractOrder pay(AbstractOrder abstractOrder) {
        PaymentType paymentType = super.getPaymentService().pay(abstractOrder);
        System.out.println("SiteOne, order has been pay by: " + paymentType.name());
        return abstractOrder;
    }
}
