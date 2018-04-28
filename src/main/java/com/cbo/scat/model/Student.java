package com.cbo.scat.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Student implements Pojo {

    private long stuId;
    private String stuNo;
    private String stuName;
    private String stuSex;
    private int stuAge;
    private String stuPhone;
    private Date registerTime;
    private int stuGrade;   //由于时间变化，年级采用int用来计算 当前年级   默认
    private String stuAddress;
    private String stuRemark;
    private String stuSchool;

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuPhone='" + stuPhone + '\'' +
                ", registerTime=" + registerTime +
                ", stuGrade=" + stuGrade +
                ", stuAddress='" + stuAddress + '\'' +
                ", stuRemark='" + stuRemark + '\'' +
                ", stuSchool='" + stuSchool + '\'' +
                '}';
    }

    public long getStuId() {
        return stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public int getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(int stuGrade) {
        this.stuGrade = stuGrade;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuRemark() {
        return stuRemark;
    }

    public void setStuRemark(String stuRemark) {
        this.stuRemark = stuRemark;
    }

    public String getStuSchool() {
        return stuSchool;
    }

    public void setStuSchool(String stuSchool) {
        this.stuSchool = stuSchool;
    }

    @Override
    public long getPojoId() {
        return stuId;
    }
}
