package com.cbo.scat.server;

import com.cbo.scat.dao.BaseDao;
import com.cbo.scat.model.Pojo;

import java.util.List;

/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public abstract class BaseService {

    public abstract BaseDao getBaseDao();

    public Pojo get(long id){
        return getBaseDao().get(id);
    }

    public Integer add(Pojo pojo){
    	return getBaseDao().add(pojo);
    }

    public void updata(Pojo pojo){
        getBaseDao().update(pojo);
    }

    public void delete(long id){
        getBaseDao().delete(id);
    }

    public List<Pojo> find(Pojo pojo){
        return getBaseDao().find(pojo);
    }

}
