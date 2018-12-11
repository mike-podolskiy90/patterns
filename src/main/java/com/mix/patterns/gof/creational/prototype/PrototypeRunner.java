package com.mix.patterns.gof.creational.prototype;

public class PrototypeRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep original = new Sheep("Jolly");
        System.out.println(original);

        Sheep cloned = original.clone();
        cloned.setName("Dolly");
        System.out.println(cloned);
    }
}
