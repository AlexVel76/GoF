package com.gof.creational.common;

import java.util.List;

public abstract class AbstractOrder {
    private List<String> entities;
    private String user;
    private PaymentSystem paymentSystem;

    public PaymentSystem getPayment() {
        return paymentSystem;
    }

    public void setPayment(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public List<String> getEntities() {
        return entities;
    }

    public void setEntities(List<String> entities) {
        this.entities = entities;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
