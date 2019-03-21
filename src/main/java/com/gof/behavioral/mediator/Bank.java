package com.gof.behavioral.mediator;

public class Bank {
    private int amount;
    private Mediator mediator;

    public void addMoney(int sum){
        amount = amount + sum;
        mediator.informOfIncreasing(sum);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
