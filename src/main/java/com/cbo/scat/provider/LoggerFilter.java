package com.cbo.scat.provider;

import groovy.util.logging.Slf4j;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

/**
 * @Author: chengbo
 * @Date: 2018/4/27
 */
@Slf4j
public class LoggerFilter implements ContainerRequestFilter,ContainerResponseFilter {


    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        //containerRequestContext.get
        //log.
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {

    }
}
