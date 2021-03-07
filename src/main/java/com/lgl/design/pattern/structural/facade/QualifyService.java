package com.lgl.design.pattern.structural.facade;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
