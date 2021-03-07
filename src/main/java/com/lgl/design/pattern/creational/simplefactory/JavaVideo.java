package com.lgl.design.pattern.creational.simplefactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
