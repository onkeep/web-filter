package com.para;

import javax.servlet.http.HttpSessionListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.para.listener.MyHttpSessionListener;
import com.para.servlet.MyServlet1;

/**
 * 
 * 
 * 大家也许会看到有些demo使用了3个注解： @Configuration；
 * 
 * @EnableAutoConfiguration
 * @ComponentScan
 * 
 * 				其实：@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
 * 
 *                等价于以默认属性使用@Configuration，
 *                @EnableAutoConfiguration和@ComponentScan
 * 
 * 所以大家不要被一些文档误导了，让自己很迷茫了，希望本文章对您有所启发；
 * 
 * @author para
 * @version v.0.1
 */
@SpringBootApplication
@ServletComponentScan
public class App {
	
	/**
	 * 注册Servlet.不需要添加注解：@ServletComponentScan
	 * @return
	 */
	@Bean
	public ServletRegistrationBean MyServlet1(){
		return new ServletRegistrationBean(new MyServlet1(),"/myServlet1/*");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
