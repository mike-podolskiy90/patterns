package com.mix.patterns.gof.behavioral.chainofresponsibility;

public abstract class Logger {
    public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    protected int mask;

    protected Logger next;

    public Logger(int mask) {
        this.mask = mask;
    }

    public Logger setNext(Logger log) {
        this.next = log;
        return log;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }

        if (next != null) {
            next.message(msg, priority);
        }
    }

    protected abstract void writeMessage(String msg);
}
