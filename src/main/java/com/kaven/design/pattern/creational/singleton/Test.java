package com.kaven.design.pattern.creational.singleton;

public class Test {
    private static final int THREAD_NUMBER = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREAD_NUMBER];
        MyRunnable myRunnable = new MyRunnable();
        for (int i = 0; i < THREAD_NUMBER; i++) {
            threads[i] = new Thread(myRunnable);
            threads[i].setName("线程"+i);
            threads[i].start();
        }
        for (int i = 0; i < THREAD_NUMBER; i++) {
            threads[i].join();
        }
        System.out.println("线程全部执行完成！");
//        System.out.println("创建了 "+Singleton.getCount()+" 次单例模式类实例");
    }
}
