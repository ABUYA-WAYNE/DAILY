package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student() {}

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(int id, String name, int age, String grade) {
        this(name, age, grade);
        this.id = id;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + grade;
    }
}
