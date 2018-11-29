package com.mix.patterns.gof.structural.composite;

public class Square implements Graphic {

    private static int counter = 1;

    @Override
    public void print() {
        System.out.println("Square: " + counter++);
    }
}
