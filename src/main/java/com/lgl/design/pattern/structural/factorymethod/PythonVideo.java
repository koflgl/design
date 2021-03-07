package com.lgl.design.pattern.structural.factorymethod;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
