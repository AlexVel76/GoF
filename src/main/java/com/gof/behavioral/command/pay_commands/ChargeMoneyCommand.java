package com.gof.behavioral.command.pay_commands;

import com.gof.creational.common.AbstractOrder;
import com.gof.structural.bridge.paymentSystem.PaymentService;

public class ChargeMoneyCommand implements Command {
    private PaymentService paymentService;

    public ChargeMoneyCommand(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void execute(AbstractOrder order) {
        paymentService.pay(order);
    }
}
