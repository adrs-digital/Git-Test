package com.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pro.service.EmpService;

@SpringBootApplication
public class CrudRepoTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		
		EmpService eSer=null;
		
		ctx=SpringApplication.run(CrudRepoTestApplication.class, args);
		
		eSer=ctx.getBean("service",EmpService.class);
	//	System.out.println("Employees Count :: "+eSer.count());
		System.out.println("Employees Count :: "+eSer.getAllEmps());

		
		
	}

}
