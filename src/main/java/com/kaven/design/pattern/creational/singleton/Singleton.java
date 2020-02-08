package com.kaven.design.pattern.creational.singleton;

public class Singleton {
    private static volatile Singleton instance ;
    private static boolean flag = true;

    private Singleton(){
        if(flag){
            flag = false;
        }
        else{
            throw new RuntimeException("单例模式禁止反射创建实例！");
        }
    }

    public static Singleton getInstance(){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
