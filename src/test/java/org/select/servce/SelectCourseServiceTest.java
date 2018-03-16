package org.select.servce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.select.dto.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SelectCourseServiceTest {
   @Autowired
   private SelectCourseService selectCourseService;
    @Test
    public void login() {
        LoginResult result=selectCourseService.login("2","1");
        System.out.println(result);
    }

    @Test
    public void studentselectcourse() {
       int flag=selectCourseService.studentselectcourse("1111",
                "2",1,"2","3","3");
        System.out.println(flag);

    }
}