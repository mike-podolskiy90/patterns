package com.mix.patterns.gof.behavioral.visitor;

/**
 * examples:
 * java.nio.file.FileVisitor
 */
public class VisitorRunner {

    public static void main(String[] args) {
        Point2d point2d = new Point2d(1, 2);
        Visitor visitor = new Chebyshev();
        point2d.accept(visitor);
        System.out.println(point2d.getMetric());
    }
}
