package com.gof.behavioral.interpreter;

import java.util.Stack;

import org.apache.commons.lang3.StringUtils;


public class Client {

    public static int multiply(String expression) {
        int result = 0;
        final String operators = "*";

        Stack stack = new Stack();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(getNumberIfPresent(stack).toString() +  String.valueOf(c));
            } else {
                stack.push(String.valueOf(c));
            }
        }

        while (stack.size()!=1) {
            int exp1 = Integer.valueOf(stack.pop().toString());
            String operator =  stack.pop().toString();
            int exp2 = Integer.valueOf(stack.pop().toString());

            if (operator.equals("*")) {
                stack.push((new NonTerminalMultiplyExp(new TerminalExpr(exp1), new TerminalExpr(exp2))).evaluate());
            }
        }


        return (int)stack.pop();
    }

    private static String getNumberIfPresent(Stack stack) {
        String result = StringUtils.EMPTY;
        if (stack.size()!=0 && StringUtils.isNumeric((String)stack.lastElement()))
        {
            result = (String)stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("345*4*2*7"));
    }
}
