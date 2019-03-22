package com.gof.behavioral.visitor;

public class VineItem implements Visitable{
    private double price;

    public VineItem(double price) {
        this.price = price;
    }

    @Override
    public void apply(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
