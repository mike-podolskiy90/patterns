package com.mix.patterns.gof.structural.flyweight.example2;

public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You feel healed. (Potion=%s)", System.identityHashCode(this)));
    }
}
