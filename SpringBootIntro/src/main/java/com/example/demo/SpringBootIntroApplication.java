package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIntroApplication {

	public static void main(String[] args) {
		//ApplicationContext is the new Container
		//Import packages by shortcut ctrl+shift+o
		ApplicationContext ac = SpringApplication.run(SpringBootIntroApplication.class, args);
		
		//getBean(objName, className)
		MessageService ms = ac.getBean("messageService", MessageService.class);
		ms.getMsg();
	}

}
