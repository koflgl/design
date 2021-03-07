package com.lgl.design.pattern.creational.factorymethod;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
