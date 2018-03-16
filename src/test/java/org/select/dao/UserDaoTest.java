package org.select.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.select.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void queryByUsername() {
        String username="1";
        User user=userDao.queryByUsername(username);
        System.out.println(user);

    }
}