package com.example.demo;
import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.LoginServlet; 
import com.example.filter.LoginFilter;

@SpringBootApplication 
public class TestApplication  {
 
	 // test
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	// add additional bean fr other servlets
	 @Bean
	   public ServletRegistrationBean<Servlet> adminServletRegistrationBean() {
		   return new ServletRegistrationBean(new LoginServlet(), "/auth.do"); // add your servlet details here , ex login sevlet and url pattern
	   }
	 
	 @Bean
	 public FilterRegistrationBean<Filter> loggingFilter(){
		 FilterRegistrationBean<Filter> loginBean = new FilterRegistrationBean<>();
	     loginBean .setFilter(new LoginFilter()); // filter class
	     loginBean.addUrlPatterns("/auth.do"); // add additional url patterns for other urls to filter
	     return loginBean;    
	 }
	    
}

