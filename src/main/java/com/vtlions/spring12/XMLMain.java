package com.vtlions.spring12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context-file.xml");
		System.out.println(context.getBean("customer"));
		
	}

}
