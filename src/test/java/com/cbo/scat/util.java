package com.cbo.scat;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.cbo.scat.bean.Message;
import com.cbo.scat.model.Student;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class util {

   /* public static void main(String[] args) {
        Student su = new Student();
        su.setStuNo("dddd");
        System.out.println(JSON.toJSONString(su));
        Message me = Message.getNotPermission();
        System.out.println(me);
        Message mes = new Message(su);
        System.out.println(mes);
    }*/

    public static void main(String[] args) {
        String url = "http://localhost:8090/rest/aaa";
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(JacksonJsonProvider.class);
        Client client = ClientBuilder.newClient(clientConfig);
        WebTarget webTarget = client.target(url).path("student").path("add");
        Invocation.Builder builder = webTarget.request(MediaType.APPLICATION_JSON);
        Student ub = new Student();
        ub.setStuNo("aaaaaaa");
        ub.setStuName("中文");
        String res = builder.post(Entity.entity(ub, MediaType.APPLICATION_JSON), String.class);
        System.out.println(res);
    }




}
