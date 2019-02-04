package com.gof.behavioral.chainOfResponsibility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChainOfResposibilityTest {

    public static final String TEST = "test";

    @Test
    public void test() {
        AbstractFilter filter = new FilterLowCaseAlphabet();
        filter.setNextFilter(new FilterSimbols("#$%"));
        filter.setNextFilter(new FilterNumeric());

        String result = filter.doFilter(TEST);

        assertEquals(result, TEST + FilterLowCaseAlphabet.LOW_CASE_FILTER_IS_APPLIED + FilterSimbols
                .SIMBOLS_FILTER_IS_APPLIED + FilterNumeric.FILTER_NUMERIC_IS_APPLIED);
    }

}