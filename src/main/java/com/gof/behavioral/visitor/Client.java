package com.gof.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Visitable> order = new ArrayList<>();

        order.add(new FoodItem(20));
        order.add(new FoodItem(50));
        order.add(new VineItem(10));

        DiscountVisitor discountVisitor =  new DiscountVisitor();

        for (Visitable visitable : order) {
            visitable.apply(discountVisitor);
        }

        System.out.println("Total discount:" + discountVisitor.getTotalDiscount());
    }
}
