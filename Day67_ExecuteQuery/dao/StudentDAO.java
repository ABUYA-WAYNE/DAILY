package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import db.DatabaseConnector;
import model.Student;

public class StudentDAO {
    private final Connection conn;

    public StudentDAO() {
        conn = DatabaseConnector.connect();
    }

    public void addStudent(Student s) {
        String sql = "INSERT INTO students(name, age, grade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, s.getName());
            stmt.setInt(2, s.getAge());
            stmt.setString(3, s.getGrade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("❌ Error inserting student: " + e.getMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Student(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("grade")
                ));
            }
        } catch (SQLException e) {
            System.out.println("❌ Error fetching students: " + e.getMessage());
        }
        return list;
    }
}
