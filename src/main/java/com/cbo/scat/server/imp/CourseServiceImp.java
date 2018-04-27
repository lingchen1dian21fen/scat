package com.cbo.scat.server.imp;

import com.cbo.scat.dao.BaseDao;
import com.cbo.scat.dao.CourseDao;
import com.cbo.scat.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class CourseServiceImp extends BaseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public BaseDao getBaseDao() {
        return courseDao;
    }
}
