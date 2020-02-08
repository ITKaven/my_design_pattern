package com.kaven.design.pattern.behavioral.interpreter;

public class Expression {
    private  String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public  String getExpression() {
        return this.expression;
    }
}
