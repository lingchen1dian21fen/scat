package com.cbo.scat;

import com.cbo.scat.webservice.JerseyConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletRegistration;

@SpringBootApplication
@MapperScan("com.cbo.scat.dao")//将项目中对应的mapper类的路径加进来就可以了
public class ScatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScatApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean jerseyConfig(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new ServletContainer(),"/rest/*");
		registrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS,JerseyConfig.class.getName());
		return registrationBean;
	}

}
