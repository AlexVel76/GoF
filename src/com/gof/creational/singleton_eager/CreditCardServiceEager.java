package com.gof.creational.singleton_eager;

public final class CreditCardServiceEager {
    private final static CreditCardServiceEager instance = new CreditCardServiceEager();

    private CreditCardServiceEager() {
    }

    public static CreditCardServiceEager getInstance() {
        return instance;
    }
}
