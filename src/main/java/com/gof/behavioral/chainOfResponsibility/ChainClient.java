package com.gof.behavioral.chainOfResponsibility;

public class ChainClient {

    public static void main(String[] args) {
        AbstractFilter filter = new FilterLowCaseAlphabet();
        filter.setNextFilter(new FilterSimbols("#$%"));
        filter.setNextFilter(new FilterNumeric());

        System.out.println(filter.doFilter("Hello Alex123, how are y$o#u?"));
    }
}
