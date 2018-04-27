package com.cbo.scat.provider;

import groovy.util.logging.Slf4j;

import javax.ws.rs.NameBinding;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: chengbo
 * @Date: 2018/4/27
 */
@NameBinding
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(value= RetentionPolicy.RUNTIME)
public @interface UserLogger {
}
