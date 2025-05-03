package constructorinjection.beans;

public class Student {

    private String name;
    private String email;

    private Course course;

    public Student() {
        System.out.println("This is default constructor here");
    }

    public Student(String name, String email, Course course) {
        System.out.println("This is 2-param constructor");
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public void startMyCourse() {
        course.startCourse();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + ", course=" + course.getName() + "]";
    }

}
