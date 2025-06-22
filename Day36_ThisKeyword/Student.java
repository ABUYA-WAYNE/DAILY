// File: Student.java
public class Student {
    String name;
    int age;

    public Student() {
    this("high School",2000);}

    // Constructor using this to differentiate between local and instance variables
    public Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;
    }

    // Method using this to call another method
    public void display() {
        this.greet(); // Optional: same as greet()
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public void greet() {
        System.out.println("Hello from the student!");
    }

    // Method chaining using 'this'
    public Student updateName(String name) {
        this.name = name;
        return this; // returns the current object
    }

    public Student updateAge(int age) {
        this.age = age;
        return this;
    }
}
