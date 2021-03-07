package com.lgl.design.pattern.structural.factorymethod;


/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
