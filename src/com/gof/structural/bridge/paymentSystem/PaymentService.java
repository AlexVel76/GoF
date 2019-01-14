package com.gof.structural.bridge.paymentSystem;

import com.gof.PaymentType;
import com.gof.creational.common.AbstractOrder;

public interface PaymentService {
    PaymentType pay(AbstractOrder abstractOrder);
}
