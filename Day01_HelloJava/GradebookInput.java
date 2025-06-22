
import java.util.Scanner;

public class GradebookInput {

    public static String[] inputStudentNames(Scanner scanner, int numStudents) {
        String[] students = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = scanner.next();
        }
        return students;
    }

    public static String[] inputSubjectNames(Scanner scanner, int numSubjects) {
        String[] subjects = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
        }
        return subjects;
    }

    public static int[][] inputGrades(Scanner scanner, String[] students, String[] subjects) {
        int[][] grades = new int[students.length][subjects.length];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter grades for " + students[i] + ":");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print("  " + subjects[j] + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }
        return grades;
    }
}
