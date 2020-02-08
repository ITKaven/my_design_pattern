package com.kaven.design.pattern.behavioral.interpreter;

public class NumberInterpreter implements Interpreter {
    private int number;
    public NumberInterpreter(int number){
        this.number = number;
    }
    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }
    public int interpret() {
        return this.number;
    }
}
