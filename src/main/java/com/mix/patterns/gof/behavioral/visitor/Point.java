package com.mix.patterns.gof.behavioral.visitor;

public abstract class Point {
    private double metric = -1;

    public abstract void accept(Visitor visitor);

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }
}
