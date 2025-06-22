import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("wayne", 90),
            new Student("Zane", 80),
            new Student("Alex", 88),
            new Student("Mira", 76)
        );

        StudentProcessor processor = new StudentProcessor();

        List<String> topStudents = processor.getTopStudents(students);

        System.out.println("Top Scoring Students:");
        topStudents.forEach(System.out::println);
    }
}
