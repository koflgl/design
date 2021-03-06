package com.lgl.design.pattern.creational.simplefactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:13
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
