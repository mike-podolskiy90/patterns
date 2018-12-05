package com.mix.patterns.gof.behavioral.mediator;

public class MediatorRunner {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague1 colleague1 = new Colleague1(mediator);
        Colleague2 colleague2 = new Colleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        mediator.send("How are you?", colleague1);
        mediator.send("Fine, thanks", colleague2);
    }
}
