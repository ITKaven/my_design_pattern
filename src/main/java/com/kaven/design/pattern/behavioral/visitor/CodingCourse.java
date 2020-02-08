package com.kaven.design.pattern.behavioral.visitor;

public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
