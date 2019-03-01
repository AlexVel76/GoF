package com.gof.behavioral.mediator;

public interface Mediator {
    public String send(String message, Job sender, Job reciever);
}
