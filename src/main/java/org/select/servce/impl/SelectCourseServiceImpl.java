package org.select.servce.impl;

import org.select.dao.CourseDao;
import org.select.dao.StudentDao;
import org.select.dao.UserDao;
import org.select.dto.LoginResult;
import org.select.entity.Course;
import org.select.entity.Student;
import org.select.entity.User;
import org.select.enums.UserEnum;
import org.select.servce.SelectCourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class SelectCourseServiceImpl implements SelectCourseService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserDao userDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private CourseDao courseDao;
    public LoginResult login(String username, String password) {
        User user=userDao.queryByUsername(username);
        /*
        0是学生，1是教师，2是管理员,-1账户不存在
         */
        if(user==null)
        {   logger.info("该账户不存在!");
            return new LoginResult(UserEnum.NOUSER);
        }

        else if(user.getPassword().equals(password)){
            if(user.getState()==0)
            {   logger.info("学生"+username+"登陆成功");
                return new LoginResult(UserEnum.STUDENT);
            }
            else if (user.getState()==1)
            {  logger.info("教师"+username+"登陆成功");
                return new LoginResult(UserEnum.TEACHER);
            }
            else if (user.getState()==2)
            {   logger.info("管理员"+username+"登陆成功");
                return new LoginResult(UserEnum.ADMINISTRATOR);
            }

        }
        logger.info("用户输入密码错误!");
         return new LoginResult(UserEnum.FAIL);
   }

    public int studentselectcourse(String username, String studentName, int courseId, String courseName, String courseTeacher, String classroom) {
       Student student=studentDao.queryByUsernameAndCourseId(username,courseId);
       if(student!=null)
       {
           return 0;
       }
       else{
           Date nowTime=new Date();
           Course course=courseDao.queryById(courseId);
           int select=studentDao.queryByCourseId(courseId);
           Date startTime=course.getStartTime();
           Date endTime=course.getEndTime();
           if(nowTime.getTime()<startTime.getTime()||nowTime.getTime()>endTime.getTime())
           {
               logger.info("选课尚未开启!");
               return 1;
           }
           else if(course.getNumber()<select)
           {   logger.info("选课人数已满!");
               return 2;
           }
           else {
               int insert=studentDao.insert(username,studentName,courseId,courseName,courseTeacher,classroom);
               logger.info("学生"+studentName+"选课成功!");
               return 3;
           }

       }
    }
}
