package com.lgl.design.pattern.structural.proxy.dynamicproxy;


import com.lgl.design.pattern.structural.proxy.IOrderService;
import com.lgl.design.pattern.structural.proxy.Order;
import com.lgl.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
