package com.cbo.scat.bean;


import com.alibaba.fastjson.JSON;
import com.cbo.scat.model.Pojo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class Message implements Serializable {

    public interface MessageSate{
        public final static int SUCCESS = 200;
        public final static int NOT_PERMISSION = 100;
        public final static int NULL_DATA = 300;
    }

    private List<Pojo> data;
    private String message;
    private int state;

    public static Message getNotPermission(){
        Message message = new Message();
        message.state = MessageSate.NOT_PERMISSION;
        message.message = "not permission";
        return message;
    }

    private Message(){
    }

    public Message(Pojo pojo) {
        if(pojo==null){
            message = "null data";
            state = MessageSate.NULL_DATA;
        }else{
            data = new ArrayList<>();
            data.add(pojo);
            state = MessageSate.SUCCESS;
            message = "success";
        }
    }

    public Message(List<Pojo> data){
        if(data==null){
            message = "null data";
            state = MessageSate.NULL_DATA;
        }else{
            this.data = data;
            state = MessageSate.SUCCESS;
            message = "success";
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Pojo> getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getState() {
        return state;
    }

    public String toJson(){
        return JSON.toJSONString(this);
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }


}
