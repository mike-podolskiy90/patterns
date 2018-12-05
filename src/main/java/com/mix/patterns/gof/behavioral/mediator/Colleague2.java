package com.mix.patterns.gof.behavioral.mediator;

public class Colleague2 extends Colleague {

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}
