package com.cbo.scat.dao;

import com.cbo.scat.model.Pojo;

import java.util.List;

/**
 *
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public interface BaseDao {

    public Pojo get(long id);

    public void add(Pojo pojo);

    public void update(Pojo u);

    public void delete(long id);

    public List<Pojo> find(Pojo u);

}
