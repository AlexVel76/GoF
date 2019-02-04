package com.gof.behavioral.chainOfResponsibility;

public class FilterLowCaseAlphabet extends AbstractFilter {

    public static final String LOW_CASE_FILTER_IS_APPLIED = " Low Case Filter is applied";

    public FilterLowCaseAlphabet() {
    }

    public FilterLowCaseAlphabet(String filterRule) {
        super(filterRule);
    }

    @Override
    public String applyFilter(String data) {
        return data + LOW_CASE_FILTER_IS_APPLIED;
    }
}
