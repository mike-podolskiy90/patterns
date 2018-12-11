package com.mix.patterns.gof.structural.adapter;

// Adaptee
public class Plumber {

    public Object getScrewNut() {
        return "screw nut";
    }

    public Object getPipe() {
        return "pipe";
    }

    public Object getGasket() {
        return "gasket";
    }
}
