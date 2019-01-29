package com.gof.behavioral.templateMethod;

import com.gof.PaymentType;

public class PayPalPlacementService extends OrderPlacementService {
    @Override
    protected PaymentType pay() {
        return PaymentType.PAYPAL;
    }
}
