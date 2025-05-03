package constructorinjection.beans;

// dependent spring bean class
public class Course {

    private String name;

    public Course(){
        System.out.println("This is course constructor here");
    }

    public void startCourse() {
        System.out.println("Course is loading...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
