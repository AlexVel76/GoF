package com.gof.behavioral.mediator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

    public static final String HELLO = "Hello";
    public static final String HI = "Hi";

    @Test
    void test() {
        Mediator mediator = new MediatorImpl();

        Job job1 = new JobImpl(mediator);
        Job job2 = new JobImpl(mediator);

        String result1 = mediator.send(HELLO, job1, job2);
        String result2 = mediator.send(HI, job2, job1);

        assertEquals(result1, compoundMess(job1, HELLO));
        assertEquals(result2, compoundMess(job2, HI));
    }

    private String compoundMess(Job job1, String mess) {
        return "Message from:" + job1.toString() + " Mess: " + mess;
    }
}