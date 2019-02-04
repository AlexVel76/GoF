package com.gof.behavioral.chainOfResponsibility;

public class FilterNumeric extends AbstractFilter {
    public FilterNumeric() {
    }

    public FilterNumeric(String filterRule) {
        super(filterRule);
    }

    @Override
    public String applyFilter(String data) {
        return data + " Filter Numeric is applied";
    }
}