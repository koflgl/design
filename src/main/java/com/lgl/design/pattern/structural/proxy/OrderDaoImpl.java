package com.lgl.design.pattern.structural.proxy;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
