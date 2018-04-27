package com.cbo.scat;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.cbo.scat.bean.Message;
import com.cbo.scat.model.Student;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class util {

    public static void main(String[] args) {
        Student su = new Student();
        su.setStuNo("dddd");
        System.out.println(JSON.toJSONString(su));
        Message me = Message.getNotPermission();
        System.out.println(me);
        Message mes = new Message(su);
        System.out.println(mes);
    }




}
