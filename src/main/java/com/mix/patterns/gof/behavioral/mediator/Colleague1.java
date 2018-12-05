package com.mix.patterns.gof.behavioral.mediator;

public class Colleague1 extends Colleague {

    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}
