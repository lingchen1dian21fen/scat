package com.cbo.scat.webservice;

import com.alibaba.fastjson.JSON;
import com.cbo.scat.bean.Message;
import com.cbo.scat.model.Student;
import com.cbo.scat.model.User;
import com.cbo.scat.provider.LoggerFilter;
import com.cbo.scat.server.imp.StudentServiceImp;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
@Slf4j
@Path("/{userNo}/student")
public class StudentRest extends ScatRest{

    @Autowired
    private StudentServiceImp stuService;

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @LoggerFilter.UserLogger
    public String get(@PathParam("id") int id,@PathParam("userNo") String userNo) {
        User user = checkUser(userNo);
        if(user == null){
            return Message.getNotPermission().toJson();
        }
        Student stu = (Student) stuService.get(id);
        return new Message(stu).toJson();
    }

    @POST
    @Path("/add")
    @Consumes( MediaType.APPLICATION_JSON+";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON)
    @LoggerFilter.UserLogger
    public String add(Student stu,@PathParam("userNo") String userNo){
    	Date registerTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = sdf.format(registerTime);
		stu.setRegisterTime(now);
		Integer i = stuService.add(stu);
		String msg = null;
		if (i > 0) {
			msg = "success";
		} else {
			msg = "faild";
		}
		return JSON.toJSONString(msg);
    }

    @GET
    @Path("/test/{msg}")
    @Consumes( MediaType.APPLICATION_JSON+";charset=UTF-8")
    @Produces(MediaType.APPLICATION_JSON)
    @LoggerFilter.UserLogger
    public String test(@PathParam("msg")String msg){
        System.out.println(msg);
        return msg;
    }


}
