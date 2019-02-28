package com.gof.behavioral.interpreter;

public class TerminalExpr  implements Expression{
    private final int value;

    public TerminalExpr(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }



}
