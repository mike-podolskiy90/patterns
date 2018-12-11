package com.mix.patterns.gof.creational.singleton.example2;

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }
}
