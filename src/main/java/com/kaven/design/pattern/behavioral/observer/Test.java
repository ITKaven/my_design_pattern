package com.kaven.design.pattern.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher1 = new Teacher("Kaven");
        Teacher teacher2 = new Teacher("yy");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑
        Question question = new Question();
        question.setUserName("Jack");
        question.setQuestionContent("观察者模式如何实现？");

        course.produceQuestion(course , question);
    }
}
