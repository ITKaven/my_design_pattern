package com.kaven.design.pattern.behavioral.chainofresponsibility;


import org.springframework.util.StringUtils;

public class ArticleApprover extends Approver {
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }
        else{
                System.out.println(course.getName()+"不包含手记，不批准");
                return ;
        }
    }
}
