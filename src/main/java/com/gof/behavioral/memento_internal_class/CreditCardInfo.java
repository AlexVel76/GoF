package com.gof.behavioral.memento_internal_class;

import java.time.LocalDateTime;

//give user ability to preview changes of credit card name and its kay
public class CreditCardInfo {
    private String uid;
    private String userName;
    private String cardNumber;
    private String date;
    private String secretKey;


    public CreditCardInfo(String uid, String userName, String cardNumber, String date, String secretKey) {
        this.uid = uid;
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.date = date;
        this.secretKey = secretKey;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public CreditCardMemento makeSnapshot() {
        return new CreditCardMemento();
    }

    public void restore(MementoSnapshot mementoSnapshot) {
        userName = mementoSnapshot.getCardUserName();
        secretKey = mementoSnapshot.getCardSecretKey();
    }

    @Override
    public String toString() {
        return "CreditCardInfo{" +
                "uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", date='" + date + '\'' +
                ", secretKey='" + secretKey + '\'' +
                '}';
    }

    private class CreditCardMemento implements MementoSnapshot {
        private String cardSecretKey;
        private String cardUserName;


        public CreditCardMemento() {
            this.cardSecretKey = secretKey;
            this.cardUserName = userName;
        }

        @Override
        public String getCardSecretKey() {
            return cardSecretKey;
        }

        @Override
        public String getCardUserName() {
            return cardUserName;
        }
    }
}
