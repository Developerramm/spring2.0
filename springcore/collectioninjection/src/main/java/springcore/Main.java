package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.bean.Collegeinfo;
import springcore.bean.Faculty;
import springcore.bean.Student;
import springcore.bean.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("config.xml");

        Student student = null;
        student = ap.getBean("student", Student.class);
        System.out.println(student.toString());

        Faculty faculty = null;
        faculty = ap.getBean("faculty", Faculty.class);
        System.out.println(faculty.toString());

        User user = null;
        user = ap.getBean("user", User.class);
        System.out.println(user.toString());

        Collegeinfo collegeinfo = null;
        collegeinfo = ap.getBean("info", Collegeinfo.class);
        System.out.println(collegeinfo.toString());

        System.out.println(ap);
    }
}