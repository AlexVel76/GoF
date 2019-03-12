package com.gof.behavioral.memento_internal_class;

public class Client {
    public static void main(String[] args) {
        CreditCardInfo creditCardInfo = new CreditCardInfo("uid", "user1",
                "1234123412340000", "22-04-2018", "435");

        System.out.println(creditCardInfo);

        CareTaker careTaker = new CareTaker();

        careTaker.add(creditCardInfo.makeSnapshot());
        creditCardInfo.setSecretKey("new secret key");
        creditCardInfo.setUserName("new User Name");

        System.out.println(creditCardInfo);

        creditCardInfo.restore(careTaker.get());

        System.out.println(creditCardInfo);

    }
}
