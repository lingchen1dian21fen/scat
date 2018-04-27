package com.cbo.scat.model;

import java.util.Date;
/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public class Course implements Pojo{

    private long courseId;
    private String courseName;
    private String courseGrade;
    private Date startTime;
    private Date endTime;
    private int courseState;  // 0 其他  1 临时  2 完成

    public long getCourseId()  {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getCourseState() {
        return courseState;
    }

    public void setCourseState(int courseState) {
        this.courseState = courseState;
    }

    @Override
    public long getPojoId() {
        return courseId;
    }
}
