package com.mix.patterns.gof.structural.flyweight.example2;

public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You become invisible. (Potion=%s)", System.identityHashCode(this)));
    }
}
