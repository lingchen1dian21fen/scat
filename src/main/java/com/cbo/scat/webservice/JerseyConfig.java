package com.cbo.scat.webservice;

import com.cbo.scat.provider.LoggerFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * @Author: chengbo
 * @Date: 2018/4/25
 */
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(LoggerFilter.class);
        register(JacksonFeature.class);
        register(StudentRest.class);

    }
}
