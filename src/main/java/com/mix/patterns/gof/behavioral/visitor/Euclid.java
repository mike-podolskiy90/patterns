package com.mix.patterns.gof.behavioral.visitor;

public class Euclid implements Visitor {
    @Override
    public void visit(Point2d point) {
        point.setMetric(Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY()));
    }

    @Override
    public void visit(Point3d point) {
        point.setMetric(Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY() + point.getZ() * point.getZ()));
    }
}
