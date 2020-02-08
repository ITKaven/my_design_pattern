package com.kaven.design.pattern.behavioral.visitor;

public class Visitor implements IVisitor{
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程："+freeCourse.getName());
    }

    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程："+codingCourse.getName()+" 价格："+codingCourse.getPrice());
    }
}
