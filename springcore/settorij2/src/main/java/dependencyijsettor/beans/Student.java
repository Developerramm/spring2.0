package dependencyijsettor.beans;

public class Student {

    private String name;
    private String username;
    private String email;

    private Course course;

    public Student(){
        System.out.println("Student constructor is called");
    }
    
    // settor method for setter injection

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        System.out.println(course.hashCode());
        this.course = course;
    }

    public void startMyCourse(){
        String msg = "Hello " + name + " |" + username;
        System.out.println(msg);
        // dependent class object is being used
        course.startCourse();
    }

}
