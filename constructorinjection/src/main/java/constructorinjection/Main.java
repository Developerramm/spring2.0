package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructorinjection.beans.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ap);
        Student student = (Student) ap.getBean("student");
        System.out.println(student.hashCode());

        System.out.println(student.toString());
        student.startMyCourse();
    }
}