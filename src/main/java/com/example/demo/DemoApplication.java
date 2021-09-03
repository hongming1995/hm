package com.example.demo;

import com.example.designMode.Strategy.CaseHandler;
import com.example.designMode.Strategy.impl.CaseHandlerServiceImpl;
import com.example.my_application_listener.FiveListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class DemoApplication {

	public static void main(String[] args){

		SpringApplication.run(DemoApplication.class, args);
		/*SpringApplication springApplication = new SpringApplication();
		FiveListenerService fiveListenerService = new FiveListenerService();
		springApplication.addListeners(fiveListenerService);
		springApplication.run(DemoApplication.class, args);*/
	}

}
