package org.select.dao;

import org.select.entity.Course;

import java.util.List;

public interface CourseDao {
    List<Course> queryAll();
    Course queryById(int courseId);
}
