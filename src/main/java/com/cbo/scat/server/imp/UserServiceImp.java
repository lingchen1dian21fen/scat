package com.cbo.scat.server.imp;

import com.cbo.scat.dao.StudentDao;
import com.cbo.scat.dao.TeacherDao;
import com.cbo.scat.model.Pojo;
import com.cbo.scat.model.Student;
import com.cbo.scat.model.Teacher;
import com.cbo.scat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
@Service("userService")
public class UserServiceImp {

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;

    public User getUser(String userNo){
        Pojo pojo = studentDao.getByNo(userNo);
        if(pojo!=null){
            return new User((Student) pojo);
        }
        pojo = teacherDao.getByNo(userNo);
        if(pojo!=null){
            return new User((Teacher) pojo);
        }
        return null;
    }


}
