package com.mix.patterns.gof.behavioral.command;

public class CommandRunner {

    public static void main(String[] args) {
        final Light lamp = new Light();

        final Command switchUp = new FlipUpCommand(lamp);
        final Command switchDown = new FlipDownCommand(lamp);

        final Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(switchUp);
        mySwitch.storeAndExecute(switchDown);

        mySwitch.printCommandsHistory();
    }
}
