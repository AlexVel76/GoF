package com.gof.behavioral.chainOfResponsibility;

public class FilterNumeric extends AbstractFilter {

    public static final String FILTER_NUMERIC_IS_APPLIED = " Filter Numeric is applied";

    public FilterNumeric() {
    }

    public FilterNumeric(String filterRule) {
        super(filterRule);
    }

    @Override
    public String applyFilter(String data) {
        return data + FILTER_NUMERIC_IS_APPLIED;
    }
}