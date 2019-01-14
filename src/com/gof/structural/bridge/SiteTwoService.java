package com.gof.structural.bridge;

import com.gof.PaymentType;
import com.gof.creational.common.AbstractOrder;
import com.gof.structural.bridge.paymentSystem.PaymentService;

public class SiteTwoService extends AbstractSiteService {

    public SiteTwoService(PaymentService paymentService) {
        super(paymentService);
    }

    @Override
    AbstractOrder pay(AbstractOrder abstractOrder) {
        PaymentType paymentType = super.getPaymentService().pay(abstractOrder);
        System.out.println("SiteTwo, order has been pay by: " + paymentType.name());
        return abstractOrder;
    }
}
