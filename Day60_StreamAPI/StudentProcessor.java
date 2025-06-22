import java.util.*;
import java.util.stream.Collectors;

public class StudentProcessor {
    public List<String> getTopStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.getMarks() >= 85)             // Only top scorers
                .map(s -> s.getName().toUpperCase())         // Convert names to UPPERCASE
                .sorted()                                    // Sort names alphabetically
                .collect(Collectors.toList());               // Return as List
    }
}
