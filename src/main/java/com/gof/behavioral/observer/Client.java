package com.gof.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("new Item");
    }
}
