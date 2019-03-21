package com.gof.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Bank bank = new Bank();
        Mediator mediator = new MediatorImpl(shop, bank);

        shop.setMediator(mediator);
        bank.setMediator(mediator);

        mediator.pay(300);
    }
}
