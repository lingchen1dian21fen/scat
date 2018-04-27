package com.cbo.scat.server.imp;

import com.cbo.scat.dao.BaseDao;
import com.cbo.scat.dao.StudentDao;
import com.cbo.scat.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: chengbo
 * @Date: 2018/4/20
 */
@Service("stuService")
public class StudentServiceImp extends BaseService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public BaseDao getBaseDao() {
        return this.studentDao;
    }

}
