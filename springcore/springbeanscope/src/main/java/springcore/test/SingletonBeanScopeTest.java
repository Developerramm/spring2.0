package springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.beans.Student;

public class SingletonBeanScopeTest {
    public static void main(String[] args) {
        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("config.xml");
        System.out.println(ap);
        Student student = null;
        student = ap.getBean("student",Student.class);
        System.out.println(student);
        System.out.println(student.hashCode());
        Student s1 = ap.getBean("student",Student.class);
        System.out.println(s1.hashCode());
    }
}
