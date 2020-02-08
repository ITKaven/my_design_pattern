package com.kaven.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式")
                .buildCoursePPT("Java设计模式PPT").buildCourseVideo("Java设计模式视频")
                .buildCourseArticle("Java设计模式手记").buildCourseQA("Java设计模式问答").build();
        System.out.println(course );
    }
}
