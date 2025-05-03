package dependencyijsettor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyijsettor.beans.Employee;
import dependencyijsettor.beans.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext ap = null;
        ap = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(ap);

        Student student = (Student) ap.getBean("student");
        student.startMyCourse();

        Employee employee = (Employee) ap.getBean("emp");
        System.out.println(employee.toString());
    }
}