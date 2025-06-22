package app;

import dao.StudentDAO;
import java.util.List;
import java.util.Scanner;
import model.Student;

public class StudentApp {
    private static final StudentDAO dao = new StudentDAO();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            switch (sc.nextInt()) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> updateStudent();
                case 4-> deleteStudent();
                case 5 -> findStudent();
                default -> System.out.println("❌ Invalid choice");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n📘 STUDENT MANAGEMENT SYSTEM");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Search Student");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addStudent() {
        System.out.print("Name: ");
        sc.nextLine(); String name = sc.nextLine();
        System.out.print("Age: "); int age = sc.nextInt();
        System.out.print("Grade: "); sc.nextLine(); String grade = sc.nextLine();
        dao.addStudent(new Student(name, age, grade));
    }

    private static void viewAllStudents() {
        List<Student> students = dao.getAllStudents();
        students.forEach(System.out::println);
    }

    private static void updateStudent() {
        System.out.print("Enter ID to update: "); int id = sc.nextInt(); sc.nextLine();
        Student s = dao.findStudent(id);
        if (s == null) { System.out.println("❌ Not found."); return; }

        System.out.print("New Name: "); String name = sc.nextLine();
        System.out.print("New Age: "); int age = sc.nextInt();
        System.out.print("New Grade: "); sc.nextLine(); String grade = sc.nextLine();

        dao.updateStudent(new Student(id, name, age, grade));
    }

    private static void deleteStudent() {
        System.out.print("Enter ID to delete: "); int id = sc.nextInt();
        dao.deleteStudent(id);
    }

    private static void findStudent() {
        System.out.print("Enter ID to search: "); int id = sc.nextInt();
        Student s = dao.findStudent(id);
        if (s != null) {
            System.out.println(s);
        } else {
            System.out.println("❌ Student not found.");
        }
    }
}
