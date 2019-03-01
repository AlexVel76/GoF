package com.gof.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Job job1 = new JobImpl(mediator);
        Job job2 = new JobImpl(mediator);

        mediator.send("Hello", job1, job2);

        mediator.send("Hi", job2, job1);
    }
}
