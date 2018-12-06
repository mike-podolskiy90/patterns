package com.mix.patterns.gof.creational.factorymethod.example1;

public class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
