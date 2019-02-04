package com.gof.behavioral.chainOfResponsibility;

public class FilterSimbols extends AbstractFilter {
    public FilterSimbols() {
    }

    public FilterSimbols(String filterRule) {
        super(filterRule);
    }

    @Override
    public String applyFilter(String data) {
        return data + " Simbols Filter is applied";
    }
}