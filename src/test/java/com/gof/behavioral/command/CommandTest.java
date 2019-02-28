package com.gof.behavioral.command;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import com.gof.behavioral.command.pay_commands.ChargeMoneyCommand;
import com.gof.behavioral.command.pay_commands.ChargeMoneyUndoCommand;
import com.gof.behavioral.command.pay_commands.Command;
import com.gof.creational.common.Order;
import com.gof.structural.bridge.paymentSystem.AliPayPaymentServiceImpl;
import com.gof.structural.bridge.paymentSystem.PayPalPaymentServiceImpl;

class CommandTest {

    @Test
    public void test() {
        //Init Commands and Recievers
        //Charging do across Ali Pay system, but a canceling do throughout Pay Pal for example
        Command chargeOnAlipay = new ChargeMoneyCommand(new AliPayPaymentServiceImpl());
        Command undoCharge = new ChargeMoneyUndoCommand(new PayPalPaymentServiceImpl());

        //Init Invoker
        PaymentServ_Invoker invoker = new PaymentServ_Invoker(chargeOnAlipay, undoCharge);

        Order abstractOrder = new Order();
        invoker.charge(abstractOrder);
        invoker.unCharge(abstractOrder);
    }

}