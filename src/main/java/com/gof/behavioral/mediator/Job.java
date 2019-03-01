package com.gof.behavioral.mediator;

public interface Job {
    String prepareMessage(String message);

    String recieve(String message);
}
