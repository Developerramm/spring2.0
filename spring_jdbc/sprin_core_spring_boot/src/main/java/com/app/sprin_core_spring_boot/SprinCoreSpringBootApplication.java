package com.app.sprin_core_spring_boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.sprin_core_spring_boot.beans.Student;

@SpringBootApplication
public class SprinCoreSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		context = SpringApplication.run(SprinCoreSpringBootApplication.class, args);
		System.out.println("Bharat mata ki jai");
		System.out.println(context);
		Student student = context.getBean("student",Student.class);
		System.out.println(student);

	}

}
