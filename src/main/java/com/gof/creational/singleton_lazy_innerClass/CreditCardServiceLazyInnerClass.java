package com.gof.creational.singleton_lazy_innerClass;

public final class CreditCardServiceLazyInnerClass {
    private CreditCardServiceLazyInnerClass() {
    }

    private static class CreditCardServiceLazyInnerClassHolder {
        private final static CreditCardServiceLazyInnerClass instance = new CreditCardServiceLazyInnerClass();
    }

    public static CreditCardServiceLazyInnerClass getInstance() {
        return CreditCardServiceLazyInnerClassHolder.instance;
    }
}
