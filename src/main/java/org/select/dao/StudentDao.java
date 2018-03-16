package org.select.dao;

import org.apache.ibatis.annotations.Param;
import org.select.entity.Student;


public interface StudentDao {
    int insert(@Param("username")String username,@Param("studentName")String studentName,
               @Param("courseId")int courseId,@Param("courseName")String courseName,
               @Param("courseTeacher")String courseTeacher,@Param("classroom")String classroom);
    Student queryByUsernameAndCourseId(@Param("username") String username, @Param("courseId")int courseId);
    int queryByCourseId(int courseId);
}
