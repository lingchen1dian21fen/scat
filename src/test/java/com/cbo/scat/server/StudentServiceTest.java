package com.cbo.scat.server;

import com.cbo.scat.ScatApplicationTests;
import com.cbo.scat.model.Student;
import com.cbo.scat.server.imp.StudentServiceImp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author: chengbo
 * @Date: 2018/4/21
 */
public class StudentServiceTest extends ScatApplicationTests implements ServiceTest {

    @Autowired
    private StudentServiceImp stuService;

    @Test
    public void testGet() {

    }

    @Test
    public void testAdd(){
        Student stu = new Student();
        stu.setStuNo("bbb");
        stu.setStuName("李四");
        stu.setRegisterTime(new Date());
        stu.setStuGrade(7);
        stuService.add(stu);
    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testDelete() {

    }

    @Test
    public void testFind() {

    }

}
