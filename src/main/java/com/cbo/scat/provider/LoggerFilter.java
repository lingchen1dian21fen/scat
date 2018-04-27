package com.cbo.scat.provider;

import groovy.util.logging.Slf4j;

import javax.annotation.Priority;
import javax.ws.rs.NameBinding;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: chengbo
 * @Date: 2018/4/27
 */
@Slf4j
@Provider
@LoggerFilter.UserLogger
@Priority(Priorities.USER)
public class LoggerFilter implements ContainerRequestFilter,ContainerResponseFilter {

    @NameBinding
    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(value= RetentionPolicy.RUNTIME)
    public @interface UserLogger {
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        //containerRequestContext.get
        //log.
       System.out.println("-----");
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {

    }
}
