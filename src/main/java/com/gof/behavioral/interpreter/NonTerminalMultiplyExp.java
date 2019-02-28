package com.gof.behavioral.interpreter;

public class NonTerminalMultiplyExp implements Expression {
    Expression first;
    Expression second;

    public NonTerminalMultiplyExp(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int evaluate() {
        return first.evaluate() * second.evaluate();
    }

}
