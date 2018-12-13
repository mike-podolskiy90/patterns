package com.mix.patterns.gof.behavioral.strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called MultiplyStrategy's execute()");
        return a * b;
    }
}
