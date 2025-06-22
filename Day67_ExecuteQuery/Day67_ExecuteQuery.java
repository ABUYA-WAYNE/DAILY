import java.sql.*;
import java.util.Scanner;

public class Day67_ExecuteQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = "Waynes1600."; // update if different

        Scanner scanner = new Scanner(System.in);

        try {
            // ✅ This is the most critical missing piece
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                while (true) {
                    System.out.println("\n📘 STUDENT MANAGEMENT MENU:");
                    System.out.println("1. Add Student");
                    System.out.println("2. View All Students");
                    System.out.println("0. Exit");
                    System.out.print("Enter choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    if (choice == 1) {
                        // INSERT student
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter grade: ");
                        String grade = scanner.nextLine();

                        String insert = "INSERT INTO students(name, age, grade) VALUES (?, ?, ?)";
                        PreparedStatement insertStmt = conn.prepareStatement(insert);
                        insertStmt.setString(1, name);
                        insertStmt.setInt(2, age);
                        insertStmt.setString(3, grade);
                        int rows = insertStmt.executeUpdate();

                        System.out.println("✅ Inserted " + rows + " student(s).");

                    } else if (choice == 2) {
                        // SELECT all students
                        String select = "SELECT * FROM students";
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(select);

                        System.out.println("\n📋 List of Students:");
                        System.out.println("ID | Name | Age | Grade");
                        System.out.println("----------------------------");

                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String name = rs.getString("name");
                            int age = rs.getInt("age");
                            String grade = rs.getString("grade");
                            System.out.println(id + " | " + name + " | " + age + " | " + grade);
                        }

                    } else if (choice == 0) {
                        System.out.println("👋 Exiting. Goodbye!");
                        break;
                    } else {
                        System.out.println("❌ Invalid choice.");
                    }
                }
            } catch (SQLException e) {
                System.out.println("❌ Database error: " + e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver not found.");
        }

        scanner.close();
    }
}