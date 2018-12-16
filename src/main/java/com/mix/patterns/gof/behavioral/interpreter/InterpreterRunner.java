package com.mix.patterns.gof.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterRunner {

    public static void main(String[] args) {
        Context context = new Context();

        List<Expression> expressions = new ArrayList<>();

        expressions.add(new TerminalExpression());
        expressions.add(new IntermediateExpression());
        expressions.add(new TerminalExpression());
        expressions.add(new TerminalExpression());

        expressions.forEach(expression -> expression.interpret(context));
    }
}
