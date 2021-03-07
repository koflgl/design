package com.lgl.design.pattern.behavior.templatemethod;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
