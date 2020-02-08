package com.kaven.design.pattern.structural.proxy.jdk;

import com.kaven.design.pattern.structural.proxy.IOrderService;
import com.kaven.design.pattern.structural.proxy.Order;
import com.kaven.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService iOrderService = (IOrderService) new OrderServiceJDKDynamicProxy(new OrderServiceImpl()).bind();
        iOrderService.saveOrder(order);
    }
}
