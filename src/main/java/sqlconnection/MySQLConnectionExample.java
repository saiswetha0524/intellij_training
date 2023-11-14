package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://localhost:3306/jpa";
        String username = "root";
        String password = "root";

        // Load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading MySQL JDBC driver");
            e.printStackTrace();
            return;
        }

        // Establish a connection
        try (
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password)
        ) {
            System.out.println("Connected to MySQL database!");

            // Your database operations go here...

        } catch (SQLException e) {
            System.err.println("Error connecting to MySQL database");
            e.printStackTrace();
        }
    }
}
