package com.ashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
	
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld) ctx.getBean("helloWorld");
		System.out.println(obj.getMessage());
	}

}
