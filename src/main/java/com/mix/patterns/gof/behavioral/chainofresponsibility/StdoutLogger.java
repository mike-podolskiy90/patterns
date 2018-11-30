package com.mix.patterns.gof.behavioral.chainofresponsibility;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) {
        super(mask);
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
