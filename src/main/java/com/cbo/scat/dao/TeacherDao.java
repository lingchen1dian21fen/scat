package com.cbo.scat.dao;

import com.cbo.scat.model.Teacher;

/**
 * @Author: chengbo
 * @Date: 2018/4/20
 */
public interface TeacherDao extends BaseDao {

    public Teacher getByNo(String teaNo);

}
