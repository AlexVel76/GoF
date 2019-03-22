package com.gof.behavioral.observer;

public class Order {
    private Topic addItemTopic;

    public Order() {
        addItemTopic = new AddItemTopic();
        addItemTopic.register(new CustomerDisplay());
        addItemTopic.register(new CashierDisplay());
    }

    public void addItem(String item){
        addItemTopic.notifyObservers(item);
    }
}
