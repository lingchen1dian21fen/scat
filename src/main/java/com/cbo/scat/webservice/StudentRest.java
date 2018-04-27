package com.cbo.scat.webservice;

import com.cbo.scat.bean.Message;
import com.cbo.scat.model.Student;
import com.cbo.scat.model.User;
import com.cbo.scat.provider.LoggerFilter;
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

}
