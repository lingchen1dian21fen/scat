package com.cbo.scat.server.imp;

import com.cbo.scat.dao.BaseDao;
import com.cbo.scat.dao.SignDao;
import com.cbo.scat.server.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
@Service("signService")
public class SignServiceImp extends BaseService {

    @Autowired
    private SignDao signDao;

    @Override
    public BaseDao getBaseDao() {
        return signDao;
    }
}
