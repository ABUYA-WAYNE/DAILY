package app;

import model.Student;
import dao.StudentDAO;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.print("""
                \n📘 MENU:
                1. Add Student
                2. View All Students
                0. Exit
                Enter choice: """);

            int choice = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt(); sc.nextLine();
                    System.out.print("Grade: ");
                    String grade = sc.nextLine();
                    dao.addStudent(new Student(name, age, grade));
                    System.out.println("✅ Student added.");
                }
                case 2 -> {
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\n📋 All Students:");
                    students.forEach(System.out::println);
                }
                case 0 -> {
                    System.out.println("👋 Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("❌ Invalid option.");
            }
        }
    }
}
