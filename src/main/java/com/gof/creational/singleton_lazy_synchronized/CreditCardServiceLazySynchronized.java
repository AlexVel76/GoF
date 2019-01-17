package com.gof.creational.singleton_lazy_synchronized;

public final class CreditCardServiceLazySynchronized {
    private static volatile CreditCardServiceLazySynchronized instance;//volatile - we can hit to degradation on
    // multi CPU (volatile - prevent reordering for operation during compilation)

    private CreditCardServiceLazySynchronized() {
    }

    public static CreditCardServiceLazySynchronized getInstance() {
        if (instance == null) {
            synchronized (CreditCardServiceLazySynchronized.class) {
                if (instance == null) {
                    instance = new CreditCardServiceLazySynchronized();
                }
            }
        }
        return instance;
    }
}
