package com.mix.patterns.gof.behavioral.chainofresponsibility;

public class Runner {

    public static void main(String[] args) {
        Logger logger = new StdoutLogger(Logger.DEBUG);
        Logger logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        Logger logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

        logger.message("Entering function y.", Logger.DEBUG);
        logger.message("Step1 completed.", Logger.NOTICE);
        logger.message("An error has occurred.", Logger.ERR);
    }
}
