package com.gof.behavioral.iterator;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClientTest {

    @Test
    void iteratorTest() {

        CustomCollection array = new CustomArray(3);
        array.insert(7);
        array.insert(4);
        array.insert(8);


        String result = StringUtils.EMPTY;
        CustomIterator iter = array.getIterator();
        while (iter.hasNext()) {
            result = result + iter.next();
        }

        Assertions.assertEquals("748", result);
    }

}