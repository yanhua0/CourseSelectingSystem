package org.select.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.select.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CourseDaoTest {
    @Autowired
    private CourseDao courseDao;
    @Test
    public void queryAll() {
        List<Course> course=courseDao.queryAll();
        System.out.println(course);
    }
}