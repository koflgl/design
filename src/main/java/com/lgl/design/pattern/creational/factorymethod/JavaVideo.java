package com.lgl.design.pattern.creational.factorymethod;


/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
