package com.gof.behavioral.command.pay_commands;

import com.gof.creational.common.AbstractOrder;

public interface Command {
   void execute(AbstractOrder order);
}
