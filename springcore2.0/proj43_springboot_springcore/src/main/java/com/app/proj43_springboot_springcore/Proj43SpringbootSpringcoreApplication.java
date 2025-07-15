package com.app.proj43_springboot_springcore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.proj43_springboot_springcore.beans.Student;

@SpringBootApplication
public class Proj43SpringbootSpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = null;
		context = SpringApplication.run(Proj43SpringbootSpringcoreApplication.class, args);

		System.out.println(context.getClass().getName());

		Student student = context.getBean("student",Student.class);
		System.out.println(student);

	}

}
