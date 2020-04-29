package com.cg;

import com.cg.config.JavaConfig;
import com.cg.entities.Employee;
import com.cg.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;

public class EmployeeMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		 Class configurationClass= JavaConfig.class;
	     context.register(configurationClass);
	     context.refresh();
	     
	     IEmployeeService service = context.getBean(IEmployeeService.class);
	     System.out.println("Enter the id");
	     int id = sc.nextInt();
	     
	     Employee employee = service.fetchById(id);
	     System.out.println("Employee Info:");
	     System.out.println("Employee ID:"+employee.getId());
	     System.out.println("Employee Name:"+employee.getName());
	     System.out.println("Employee Salary:"+employee.getSalary());
	        
	        
	}
}