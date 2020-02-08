package com.kaven.design.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

public class VideoApprover extends Approver {
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频，批准");
            if(approver != null){
                approver.deploy(course);
            }
        }
        else{
            System.out.println(course.getName()+"不包含视频，不批准");
            return ;
        }
    }
}
