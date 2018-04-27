package com.cbo.scat.server.imp;

import com.cbo.scat.dao.BaseDao;
import com.cbo.scat.dao.TeacherDao;
import com.cbo.scat.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
@Service("teaService")
public class TeacherServiceImp extends BaseService {

    @Autowired
    private TeacherDao teacherDao;

    @Override
    public BaseDao getBaseDao() {
        return teacherDao;
    }
}
