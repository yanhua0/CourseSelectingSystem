package org.select.servce;

import org.select.dto.LoginResult;

public interface SelectCourseService {
    LoginResult login(String username, String password);
    int studentselectcourse(String username,String studentName,
                             int courseId,String courseName,
                             String courseTeacher,String classroom);
}
