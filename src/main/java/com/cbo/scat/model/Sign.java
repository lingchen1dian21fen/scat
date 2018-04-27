package com.cbo.scat.model;

/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public class Sign implements Pojo {

    private long signId;
    private Course course;
    private long userId;
    private String userNo;
    private String userName;
    private int userType;   // 0 其他   1 学生   2 老师

    public long getSignId() {
        return signId;
    }

    public void setSignId(long signId) {
        this.signId = signId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
        return signId;
    }
}
