package com.lgl.design.pattern.structural.proxy;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;


    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，我们课程中就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }

}
