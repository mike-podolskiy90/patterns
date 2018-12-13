package com.mix.patterns.gof.behavioral.iterator;

public class Weasley extends RedHead {
    private String name;

    public Weasley(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " Weasley";
    }
}
