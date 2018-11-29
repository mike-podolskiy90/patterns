package com.mix.patterns.gof.structural.composite;

public class Runner {

    public static void main(String[] args) {
        Graphic rectangle1 = new Rectangle();
        Graphic rectangle2 = new Rectangle();
        Graphic rectangle3 = new Rectangle();
        Graphic rectangle4 = new Rectangle();
        Graphic square1 = new Square();
        Graphic square2 = new Square();
        Graphic square3 = new Square();

        CompositeGraphic compositeGraphic1 = new CompositeGraphic();
        CompositeGraphic compositeGraphic2 = new CompositeGraphic();
        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic1.add(rectangle1);
        compositeGraphic1.add(rectangle2);
        compositeGraphic1.add(rectangle3);

        compositeGraphic1.add(rectangle4);
        compositeGraphic1.add(square1);
        compositeGraphic1.add(square2);
        compositeGraphic1.add(square3);

        compositeGraphic.add(compositeGraphic1);
        compositeGraphic.add(compositeGraphic2);

        compositeGraphic.print();
    }
}
