package com.mix.patterns.gof.creational.builder.example1;

public class BuilderRunner {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
