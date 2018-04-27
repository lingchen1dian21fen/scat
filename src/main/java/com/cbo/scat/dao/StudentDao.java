package com.cbo.scat.dao;

import com.cbo.scat.model.Student;

/**
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public interface StudentDao extends BaseDao{

    public Student getByNo(String stuNo);

}
