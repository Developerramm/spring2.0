package com.app.proj45_springboot_layeredapp_springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.proj45_springboot_layeredapp_springcore.student.controller.StudentMainController;
import com.app.proj45_springboot_layeredapp_springcore.student.vo.StudentVo;

@SpringBootApplication
public class Proj45SpringbootLayeredappSpringcoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = null;

		context = SpringApplication.run(Proj45SpringbootLayeredappSpringcoreApplication.class, args);

		StudentMainController controller = context.getBean("controller", StudentMainController.class);

		StudentVo vo = new StudentVo();
		vo.setId("10017");
		vo.setName("pooja kumari");
		vo.setCourseName("Java");
		vo.setEmail("pooja@gmail.com");
		vo.setObtainedMarks("450");
		try {
			controller.registerStudent(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			((ConfigurableApplicationContext)context).close();
		}


		System.out.println(context.getClass().getName());
	}

}
