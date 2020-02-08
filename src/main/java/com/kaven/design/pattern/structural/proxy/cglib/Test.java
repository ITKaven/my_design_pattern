package com.kaven.design.pattern.structural.proxy.cglib;

import com.kaven.design.pattern.structural.proxy.IOrderService;
import com.kaven.design.pattern.structural.proxy.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceCGLibDynamicProxy orderServiceCGLibDynamicProxy =
                new OrderServiceCGLibDynamicProxy();
        IOrderService iOrderService = orderServiceCGLibDynamicProxy.bind();
        iOrderService.saveOrder(order);
    }
}
