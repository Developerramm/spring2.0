package springcorecontainer.beans;

public class User {
    private String name;
    private String email;
    private String pass;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("User.setName()");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("User.setEmail()");
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        System.out.println("User.setPass()");
        this.pass = pass;
    }

    public User(){
        System.out.println("user constructor called");
    }

    public void showUser(){
        System.out.println(name + " " + email + " " + pass);
    }

}
