package com.mix.patterns.gof.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/** Invoker */
public class Switch {

    private List<Command> commandsHistory = new ArrayList<>();

    public void storeAndExecute(Command command) {
        commandsHistory.add(command);
        command.execute();
    }

    public void printCommandsHistory() {
        commandsHistory.forEach(System.out::println);
    }
}
