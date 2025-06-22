
import java.util.HashSet;

public class StudentManager {

    private HashSet<String> students;

    public StudentManager() {
        students = new HashSet<>();

    }

    public void addStudent(String name) {
        if (students.add(name)) {
            System.out.println(name + " is added");
        } else {
            System.out.println(name + " is a duplicate");
        }
    }

    public String showStudents() {
        System.out.println(students);
        return "";
    }
}
