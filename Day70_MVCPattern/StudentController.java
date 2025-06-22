// package Day70_MVCPattern;

public class StudentController {
    private Student model;

    public StudentController(Student model) {
        this.model = model;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public void setStudentAge(int age) {
        model.setAge(age);
    }

    public void changeStudent(String name, int age) {
        model.setName(name);
        model.setAge(age);
    }
}
