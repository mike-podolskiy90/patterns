package com.mix.patterns.gof.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Context() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
