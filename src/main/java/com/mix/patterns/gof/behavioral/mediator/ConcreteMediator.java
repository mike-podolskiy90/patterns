package com.mix.patterns.gof.behavioral.mediator;

public class ConcreteMediator extends Mediator {

    private Colleague1 colleague1;
    private Colleague2 colleague2;

    @Override
    public void send(String message, Colleague sender) {
        if (sender.equals(colleague1)) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }

    public void setColleague1(Colleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague2 colleague2) {
        this.colleague2 = colleague2;
    }
}
