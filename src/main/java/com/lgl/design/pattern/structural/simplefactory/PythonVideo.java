package com.lgl.design.pattern.structural.simplefactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:11
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
