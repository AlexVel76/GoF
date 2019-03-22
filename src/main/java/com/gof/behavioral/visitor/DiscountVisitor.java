package com.gof.behavioral.visitor;

public class DiscountVisitor implements Visitor {
    private double totalDiscount;

    @Override
    public void visit(FoodItem foodItem) {
        double discount = foodItem.getPrice() * 0.2;
        totalDiscount += discount;
        foodItem.setPrice(foodItem.getPrice() - discount);
    }

    @Override
    public void visit(VineItem vineItem) {
        double discount = vineItem.getPrice() * 0.1;
        totalDiscount += discount;
        vineItem.setPrice(vineItem.getPrice() - discount);
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }
}
