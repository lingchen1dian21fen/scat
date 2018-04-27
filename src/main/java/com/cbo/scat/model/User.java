package com.cbo.scat.model;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class User implements Pojo {

    public final static int STUDENT = 1;
    public final static int TEACHER = 2;

    private Pojo pojo;
    private String userNo;
    private String userName;
    private int userType; // 0 其他   1 学生   2 老师

    public User(Student student) {
        this.pojo = student;
        userName = student.getStuName();
        userNo = student.getStuNo();
        userType = STUDENT;
    }

    public User(Teacher teacher){
        this.pojo = teacher;
        userNo = teacher.getTeaNo();
        userName = teacher.getTeaName();
        userType = TEACHER;
    }

    public Pojo getPojo() {
        return pojo;
    }

    public void setPojo(Pojo pojo) {
        this.pojo = pojo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public long getPojoId() {
        return this.pojo.getPojoId();
    }
}
