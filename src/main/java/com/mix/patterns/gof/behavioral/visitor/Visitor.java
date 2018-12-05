package com.mix.patterns.gof.behavioral.visitor;

public interface Visitor {
    void visit(Point2d point);
    void visit(Point3d point);
}
