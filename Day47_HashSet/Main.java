// File: Main.java
// package Day47_HashSet;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent("Alice");
        manager.addStudent("Bob");
        manager.addStudent("Alice"); // duplicate
        manager.showStudents();
    }
}
