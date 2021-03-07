package com.lgl.design.pattern.creational.abstractfactory;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:15
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
