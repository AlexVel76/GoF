package com.gof.behavioral.mediator;

public class Shop {
    private Mediator mediator;

    private int countOfProduct;

    public void makePayment(int amount) {
        mediator.payment(amount);
    }

    public void payed(int sum) {
        System.out.println("Payed:" + sum);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
