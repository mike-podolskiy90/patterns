package com.mix.patterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    public void print() {
        childGraphics.forEach(Graphic::print);
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

}
