package com.lgl.design.pattern.structural.facade;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
