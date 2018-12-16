package com.mix.patterns.gof.behavioral.interpreter;

public class TerminalExpression extends Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("Expression was interpreted as " + this);
    }

    @Override
    public String toString() {
        return "Terminal";
    }
}
