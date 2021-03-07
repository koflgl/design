package com.lgl.design.pattern.structural.decorator.v1;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
