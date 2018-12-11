package com.mix.patterns.gof.structural.adapter.example1;

import com.mix.patterns.gof.structural.adapter.Chief;
import com.mix.patterns.gof.structural.adapter.Plumber;

// adapter via inheritance
public class ChiefAdapterInheritance extends Plumber implements Chief {
    @Override
    public Object makeBreakfast() {
        return getGasket();
    }

    @Override
    public Object makeLunch() {
        return getPipe();
    }

    @Override
    public Object makeDinner() {
        return getScrewNut();
    }

    @Override
    public String toString() {
        return "chief 1";
    }
}
