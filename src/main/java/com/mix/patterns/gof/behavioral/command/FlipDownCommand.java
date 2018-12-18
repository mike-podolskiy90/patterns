package com.mix.patterns.gof.behavioral.command;

public class FlipDownCommand implements Command {

    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public String toString() {
        return "FlipDownCommand";
    }
}

