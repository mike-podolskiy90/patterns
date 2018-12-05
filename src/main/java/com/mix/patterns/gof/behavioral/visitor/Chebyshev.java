package com.mix.patterns.gof.behavioral.visitor;

import java.util.stream.DoubleStream;

public class Chebyshev implements Visitor {
    @Override
    public void visit(Point2d point) {
        double ax = Math.abs(point.getX());
        double ay = Math.abs(point.getY());
        point.setMetric(ax > ay ? ax : ay);
    }

    @Override
    public void visit(Point3d point) {
        double ax = Math.abs(point.getX());
        double ay = Math.abs(point.getY());
        double az = Math.abs(point.getZ());
        point.setMetric(DoubleStream.of(ax, ay, az).max().getAsDouble());
    }
}
