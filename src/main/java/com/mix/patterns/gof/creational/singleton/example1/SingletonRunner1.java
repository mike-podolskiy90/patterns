package com.mix.patterns.gof.creational.singleton.example1;

public class SingletonRunner1 {

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        System.out.println(instance1.equals(instance2));
    }
}
