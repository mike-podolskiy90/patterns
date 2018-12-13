package com.mix.patterns.gof.behavioral.strategy;

public class AddStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called AddStrategy's execute()");
        return a + b;
    }
}
