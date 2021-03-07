package com.lgl.design.pattern.creational.factorymethod;


/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
