package com.mix.patterns.gof.behavioral.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        System.out.println("Called SubtractStrategy's execute()");
        return a - b;
    }
}
