package com.mix.patterns.gof.structural.flyweight.example2;

public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println(String.format("You feel blessed. (Potion=%s)", System.identityHashCode(this)));
    }
}
