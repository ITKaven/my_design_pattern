package com.kaven.design.pattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(Class type){
        Video video = null;
        try{
            video = (Video) Class.forName(type.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
