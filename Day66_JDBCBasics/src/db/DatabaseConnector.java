package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import config.DatabaseConfig;

public class DatabaseConnector {
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DatabaseConfig.URL, DatabaseConfig.USER, DatabaseConfig.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
