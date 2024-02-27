package rvt;

public class Student {
    public String name;
    public String surname;
    public String email;
    public String group;


    public Student(String name, String surname, String email, String group) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.group = group;
    }
    public void GetInfo() {
        System.out.println("Student name is " + this.name);
        System.out.println("Student surname is " + this.surname);
        System.out.println("Student email is " + this.email);
        System.out.println("Student group is " + this.group);
    }
}
