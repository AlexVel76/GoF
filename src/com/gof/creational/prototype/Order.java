package com.gof.creational.prototype;

public class Order implements Cloneable {
    private HardCreatedField hardCreatedField;

    private String id;

    public Order(HardCreatedField hardCreatedField) {
        this.hardCreatedField = hardCreatedField;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HardCreatedField getHardCreatedField() {
        return hardCreatedField;
    }

    public void setHardCreatedField(HardCreatedField hardCreatedField) {
        this.hardCreatedField = hardCreatedField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Order result = (Order) super.clone();
        result.setHardCreatedField((HardCreatedField) result.getHardCreatedField().clone());
        return result;
    }
}
