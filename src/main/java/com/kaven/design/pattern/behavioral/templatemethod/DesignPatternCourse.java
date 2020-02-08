package com.kaven.design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        //需要编写手记
        return true;
    }
}
