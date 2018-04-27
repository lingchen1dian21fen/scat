package com.cbo.scat.model;
/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public class TeacherCourse implements Pojo {

    private long teaCourseId;
    private Teacher tea;
    private String courseName;
    private String courseGrade;
    private float coursePrice;
    private float floatPrice;

    public long getTeaCourseId() {
        return teaCourseId;
    }

    public void setTeaCourseId(long teaCourseId) {
        this.teaCourseId = teaCourseId;
    }

    public Teacher getTea() {
        return tea;
    }

    public void setTea(Teacher tea) {
        this.tea = tea;
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

    public float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(float coursePrice) {
        this.coursePrice = coursePrice;
    }

    public float getFloatPrice() {
        return floatPrice;
    }

    public void setFloatPrice(float floatPrice) {
        this.floatPrice = floatPrice;
    }

    @Override
    public long getPojoId() {
        return teaCourseId;
    }
}
