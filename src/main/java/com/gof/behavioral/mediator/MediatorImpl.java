package com.gof.behavioral.mediator;

public class MediatorImpl implements Mediator {
  private Shop shop;
  private Bank bank;

    public MediatorImpl(Shop shop, Bank bank) {
        this.shop = shop;
        this.bank = bank;
    }


    @Override
    public void informOfIncreasing(int sum) {
        shop.payed(sum);
    }

    @Override
    public void payment(int amount) {
        bank.addMoney(amount);
    }

    @Override
    public void pay(int amount) {
        shop.makePayment(amount);
    }
}
