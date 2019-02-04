package com.gof.behavioral.chainOfResponsibility;

public class FilterLowCaseAlphabet extends AbstractFilter {
    public FilterLowCaseAlphabet() {
    }

    public FilterLowCaseAlphabet(String filterRule) {
        super(filterRule);
    }

    @Override
    public String applyFilter(String data) {
        return data + " Low Case Filter is applied";
    }
}
