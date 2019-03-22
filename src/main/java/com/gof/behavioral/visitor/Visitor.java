package com.gof.behavioral.visitor;

public interface Visitor {
    void visit(FoodItem foodItem);
    void visit(VineItem vineItem);
}
