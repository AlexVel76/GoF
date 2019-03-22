package com.gof.behavioral.visitor;

public class FoodItem implements Visitable{

    private double price;

    public FoodItem(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void apply(Visitor visitor) {
        visitor.visit(this);
    }
}
