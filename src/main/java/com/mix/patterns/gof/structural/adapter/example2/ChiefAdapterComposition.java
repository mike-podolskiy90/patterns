package com.mix.patterns.gof.structural.adapter.example2;

import com.mix.patterns.gof.structural.adapter.Chief;
import com.mix.patterns.gof.structural.adapter.Plumber;

// adapter via composition
public class ChiefAdapterComposition implements Chief {

    private Plumber plumber = new Plumber();

    @Override
    public Object makeBreakfast() {
        return plumber.getGasket();
    }

    @Override
    public Object makeLunch() {
        return plumber.getPipe();
    }

    @Override
    public Object makeDinner() {
        return plumber.getScrewNut();
    }

    @Override
    public String toString() {
        return "chief 2";
    }
}
