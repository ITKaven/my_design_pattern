package com.kaven.design.pattern.structural.proxy.cglib;

import com.kaven.design.pattern.structural.proxy.Order;
import com.kaven.design.pattern.structural.proxy.OrderServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class OrderServiceCGLibDynamicProxy implements MethodInterceptor {

    public OrderServiceImpl bind(){

        Enhancer enhancer = new Enhancer();//生成代理对象
        enhancer.setSuperclass(OrderServiceImpl.class);//设置对谁进行代理
        enhancer.setCallback(this);//代理要做什么
        OrderServiceImpl orderService = (OrderServiceImpl) enhancer.create();//创建代理对象

        return orderService;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeMethod(objects[0]);
        Object object = methodProxy.invokeSuper(o,objects);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        System.out.println("CGLib动态代理 before code");
        if(object instanceof Order){
            Order order = (Order)object;
            int userId = order.getUserId();
            int dbRouter = userId % 2;
            System.out.println("CGLib动态代理分配到 【db"+dbRouter+"】处理数据");
            //TODO 分库操作
        }
        //TODO 其他类型处理
    }

    private void afterMethod(){
        System.out.println("CGLib动态代理 after code");
    }
}
