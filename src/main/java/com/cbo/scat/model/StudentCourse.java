package com.cbo.scat.model;
/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public class StudentCourse implements Pojo{

    private long stuCourseId;
    private Student stu;
    private String courseName;
    private int schoolYear;
    private float totalHour;
    private float usedHour;
    private float hourPrice;  // 备选
    private float totalPrice;
    private float accountPaid;  //已付款

    public long getStuCourseId() {
        return stuCourseId;
    }

    public void setStuCourseId(long stuCourseId) {
        this.stuCourseId = stuCourseId;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public float getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(float totalHour) {
        this.totalHour = totalHour;
    }

    public float getUsedHour() {
        return usedHour;
    }

    public void setUsedHour(float usedHour) {
        this.usedHour = usedHour;
    }

    public float getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(float hourPrice) {
        this.hourPrice = hourPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getAccountPaid() {
        return accountPaid;
    }

    public void setAccountPaid(float accountPaid) {
        this.accountPaid = accountPaid;
    }

    @Override
    public long getPojoId() {
        return stuCourseId;
    }
}
