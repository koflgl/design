package com.lgl.design.pattern.structural.facade;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
