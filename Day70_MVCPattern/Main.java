
public class Main {

    public static void main(String[] args) {
        Student student = new Student("Wayne", 21);
        StudentView view = new StudentView();
        student.registerObserver(view);

        StudentController controller = new StudentController(student);
        controller.setStudentName("Wayne Abuya");
        controller.setStudentAge(22);
        controller.changeStudent("Master Wayne", 23);
    }
}
