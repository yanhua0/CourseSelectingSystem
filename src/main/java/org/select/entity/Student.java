package org.select.entity;

import java.util.Date;

public class Student {
    private String username;
    private String studentName;
    private String courseName;
    private int courseId;
    private String teacherName;
    private String classroom;
    private Date createTime;
    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseId=" + courseId +
                ", teacherName='" + teacherName + '\'' +
                ", classroom='" + classroom + '\'' +
                ", createTime=" + createTime +
                ", id=" + id +
                '}';
    }
}
