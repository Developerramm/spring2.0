package com.app.student.testapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.student.controller.StudentMainController;
import com.app.student.vo.StudentVo;

public class StudentMainApplication {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new ClassPathXmlApplicationContext("config.xml");

        StudentMainController controller = null;
        controller = context.getBean("mainController", StudentMainController.class);

        StudentVo vo = new StudentVo();

        vo.setId("1001");
        vo.setName("amit raj");
        vo.setEmail("a@gmail.com");
        vo.setCourseName("java");
        vo.setObtainedMarks("400");

        try {
            controller.registerStudent(vo);
        } catch (Exception e) {
            System.out.println("Something wrong happened");
            e.printStackTrace();

        }

        System.out.println(context);
    }
}
