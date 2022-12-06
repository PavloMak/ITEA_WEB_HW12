package com.vtlions.spring12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotationMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);
		System.out.println(context.getBean(Customer.class));
		

	}

}
