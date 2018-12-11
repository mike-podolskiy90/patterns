package com.mix.patterns.gof.behavioral.prototype;

public class Sheep implements Cloneable {
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return new Sheep(name);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }
}
