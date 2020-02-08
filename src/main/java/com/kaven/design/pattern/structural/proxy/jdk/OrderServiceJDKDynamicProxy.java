package com.kaven.design.pattern.structural.proxy.jdk;

import com.kaven.design.pattern.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceJDKDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceJDKDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader() , cls.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        System.out.println("JDK动态代理 before code");
        if(object instanceof Order){
            Order order = (Order)object;
            int userId = order.getUserId();
            int dbRouter = userId % 2;
            System.out.println("JDK动态代理分配到 【db"+dbRouter+"】处理数据");
            //TODO 分库操作
        }
        //TODO 其他类型处理
    }

    private void afterMethod(){
        System.out.println("JDK动态代理 after code");
    }
}
