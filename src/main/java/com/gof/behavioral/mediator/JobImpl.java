package com.gof.behavioral.mediator;

public class JobImpl implements Job {

    private Mediator mediator;

    public JobImpl(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String prepareMessage(String message) {
        return "Message from:" + this.toString() + " Mess: " + message;
    }

    @Override
    public String recieve(String message) {
       return message;
    }
}
