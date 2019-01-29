package com.gof.behavioral.templateMethod;

import com.gof.PaymentType;

public class ALiPayPlacementService extends OrderPlacementService {
    @Override
    protected PaymentType pay() {
        return PaymentType.ALIPAY;
    }

    @Override
    protected String prepareOrder() {
        return "alipay preparation for order";
    }
}
