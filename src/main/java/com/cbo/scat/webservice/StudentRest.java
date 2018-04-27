package com.cbo.scat.webservice;

import com.cbo.scat.bean.Message;
import com.cbo.scat.model.Pojo;
import com.cbo.scat.model.Student;
import com.cbo.scat.model.User;
import com.cbo.scat.server.imp.StudentServiceImp;
import com.cbo.scat.server.imp.UserServiceImp;
import groovy.util.logging.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
@Slf4j
@Path("/student")
public class StudentRest {

    @Autowired
    private StudentServiceImp stuService;
    @Autowired
    private UserServiceImp userService;

    @GET
    @Path("/{userNo}/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)

    public String get(@PathParam("id") int id,@PathParam("userNo") String userNo) {
        User user = userService.getUser(userNo);
        if(user == null){
            return Message.getNotPermission().toString();
        }
        Student stu = (Student) stuService.get(id);
        return new Message(stu).toString();
    }

}
