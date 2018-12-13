package com.mix.patterns.gof.behavioral.strategy;

public class StrategyRunner {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new AddStrategy());
        int resultAdd = context.executeStrategy(3, 4);
        System.out.println(resultAdd);

        context.setStrategy(new SubtractStrategy());
        int resultSubtract = context.executeStrategy(3, 4);
        System.out.println(resultSubtract);

        context.setStrategy(new MultiplyStrategy());
        int resultMultiply = context.executeStrategy(3, 4);
        System.out.println(resultMultiply);

    }
}
