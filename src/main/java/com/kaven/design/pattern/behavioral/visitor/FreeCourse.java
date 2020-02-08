package com.kaven.design.pattern.behavioral.visitor;

public class FreeCourse extends Course {
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
