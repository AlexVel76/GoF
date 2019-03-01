package com.gof.behavioral.mediator;

public class MediatorImpl implements Mediator {
    @Override
    public String send(String message, Job sender, Job reciever) {
        String preparedMessage = sender.prepareMessage(message);
        return reciever.recieve(preparedMessage);
    }
}
