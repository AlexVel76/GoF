package com.gof.behavioral.chainOfResponsibility;

public class FilterSimbols extends AbstractFilter {

    public static final String SIMBOLS_FILTER_IS_APPLIED = " Simbols Filter is applied";

    public FilterSimbols() {
    }

    public FilterSimbols(String filterRule) {
        super(filterRule);
    }

    @Override
    public String applyFilter(String data) {
        return data + SIMBOLS_FILTER_IS_APPLIED;
    }
}