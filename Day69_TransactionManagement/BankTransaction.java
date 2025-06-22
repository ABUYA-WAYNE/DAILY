package Day69_TransactionManagement;

import java.sql.*;

public class BankTransaction {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "root";
        String password = "Waynes1600."; // 👈 Update if needed

        try {
            // ✅ Load MySQL JDBC Driver (very important)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // ✅ Open connection and start transaction
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                conn.setAutoCommit(false); // Begin manual transaction

                try (
                    PreparedStatement deduct = conn.prepareStatement(
                        "UPDATE accounts SET balance = balance - ? WHERE id = ?"
                    );
                    PreparedStatement add = conn.prepareStatement(
                        "UPDATE accounts SET balance = balance + ? WHERE id = ?"
                    )
                ) {
                    // 👇 STEP 1: Deduct 1000 from Account 1
                    deduct.setDouble(1, 1000);
                    deduct.setInt(2, 1);
                    deduct.executeUpdate();

                    // 🔥 Simulate failure to test rollback
                    if (true) {
                        throw new SQLException("💥 Simulated transfer failure after deduction");
                    }

                    // 👇 STEP 2: Add 1000 to Account 2
                    add.setDouble(1, 1000);
                    add.setInt(2, 2);
                    add.executeUpdate();

                    conn.commit(); // ✅ Commit if all good
                    System.out.println("✅ Transaction committed successfully.");

                } catch (SQLException ex) {
                    conn.rollback(); // ❌ Something failed — undo everything
                    System.out.println("❌ Transaction failed. Rolled back.");
                    ex.printStackTrace();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
