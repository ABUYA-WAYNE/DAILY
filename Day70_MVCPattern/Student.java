// package Day70_MVCPattern;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<StudentObserver> observers = new ArrayList<>();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        DatabaseConnection.getInstance().query("INSERT INTO students VALUES ('" + name + "', " + age + ")");
    }

    public void registerObserver(StudentObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (StudentObserver o : observers) {
            o.update(name, age);
        }
    }

    public void setName(String name) {
        this.name = name;
        DatabaseConnection.getInstance().query("UPDATE students SET name = '" + name + "'");
        notifyObservers();
    }

    public void setAge(int age) {
        this.age = age;
        DatabaseConnection.getInstance().query("UPDATE students SET age = " + age);
        notifyObservers();
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
