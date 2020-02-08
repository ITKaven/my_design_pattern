package com.kaven.design.pattern.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start——");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end——");

        System.out.println("前端课程start——");
        ACourse fePatternCourse = new FECourse();
        fePatternCourse.makeCourse();
        System.out.println("前端课程end——");
    }
}
