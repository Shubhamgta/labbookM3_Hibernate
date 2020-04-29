package com.mycompany.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		Class configurationClass=JavaConfig.class;
		context.register(configurationClass);
		
		context.refresh();
		context.registerShutdownHook();
		
		Employee employee=context.getBean(Employee.class);
		System.out.println(employee);
		
		
		
		
	}

}
