package com.mix.patterns.gof.creational.factorymethod.example1;

public class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
