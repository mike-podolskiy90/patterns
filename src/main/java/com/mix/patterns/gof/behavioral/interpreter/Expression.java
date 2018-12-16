package com.mix.patterns.gof.behavioral.interpreter;

public abstract class Expression {
    public Expression() {
    }

    public abstract void interpret(Context context);

    public abstract String toString();
}
