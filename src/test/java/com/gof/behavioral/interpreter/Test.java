package com.gof.behavioral.interpreter;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    void multiplyTest() {
        assertEquals(88, Client.multiply("44*2"));
        assertEquals(0, Client.multiply("44*2*0"));
        assertEquals(10000, Client.multiply("10*10*10*10"));
    }
}