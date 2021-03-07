package com.lgl.design.pattern.behavior.iterator;

/**
 * @author lgl
 * @Description
 * @Date 2021/3/7 18:10
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();

}
