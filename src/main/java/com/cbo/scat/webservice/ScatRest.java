package com.cbo.scat.webservice;

import com.cbo.scat.model.User;
import com.cbo.scat.server.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: chengbo
 * @Date: 2018/4/27
 */
public class ScatRest {

    @Autowired
    protected UserServiceImp userService;

    protected User checkUser(String userNo){
        return userService.getUser(userNo);
    }

}
