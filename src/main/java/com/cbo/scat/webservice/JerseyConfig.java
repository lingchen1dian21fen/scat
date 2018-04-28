package com.cbo.scat.webservice;

import com.cbo.scat.provider.LoggerFilter;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //转换格式资源类
        register(JacksonJsonProvider.class);
        // 日志过滤器
        register(LoggerFilter.class);
        register(JacksonFeature.class);
        register(StudentRest.class);
        //register("com.cbo.scat.webservice");
    }
}
