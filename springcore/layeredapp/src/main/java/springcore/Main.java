package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.controller.StudentMainController;
import springcore.vo.StudentVo;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        StudentMainController controller = null;

        ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
        controller = ap.getBean("mainController", StudentMainController.class);

        StudentVo vo = new StudentVo();

        vo.setId("1003");
        vo.setName("Kapal Kumar");
        vo.setEmail("kapal@gmai.com");
        vo.setCourseName("Java core");
        vo.setObtMarks("150");

        try {
            controller.registerStudetnRequest(vo);
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

        System.out.println(ap);
    }
}