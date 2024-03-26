package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.example"})
@ComponentScan(basePackages = {"com.example"})
@MapperScan("com.example.mapper")
public class DemoApplication {

	public static void main(String[] args){

		SpringApplication.run(DemoApplication.class, args);
		/*SpringApplication springApplication = new SpringApplication();
		FiveListenerService fiveListenerService = new FiveListenerService();
		springApplication.addListeners(fiveListenerService);
		springApplication.run(DemoApplication.class, args);*/
	}

}
