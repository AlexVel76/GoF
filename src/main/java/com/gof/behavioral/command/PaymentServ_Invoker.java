package com.gof.behavioral.command;

import com.gof.behavioral.command.pay_commands.Command;
import com.gof.creational.common.AbstractOrder;

public class PaymentServ_Invoker {
    private Command chargeCommand;
    private Command undoChargeCharge;

    public PaymentServ_Invoker(Command chargeCommand, Command undoChargeCharge) {
        this.chargeCommand = chargeCommand;
        this.undoChargeCharge = undoChargeCharge;
    }

    public void charge(AbstractOrder abstractOrder){
        chargeCommand.execute(abstractOrder);
    }

    public void unCharge(AbstractOrder abstractOrder){
        undoChargeCharge.execute(abstractOrder);
    }
}
