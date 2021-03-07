package com.lgl.design.pattern.structural.factorymethod;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }

}
