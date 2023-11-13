package sqlconnection;

import java.sql.*;
import java.util.Scanner;

public class MySQLQueryExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://localhost:3306/jpa";
        String username = "root";
        String password = "root";

        System.out.println("Enter the id: ");
        Scanner sc= new Scanner(System.in);
        final int id=sc.nextInt();
        System.out.println(id);
        // SQL query to retrieve data
        String sqlQuery = "SELECT id, name FROM emp WHERE id= "+id;


        try (
                // Establish a connection
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

                // Create a prepared statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
               /* final String string1=String.valueOf(id);
                preparedStatement.setString(1, string1);*/
                // Execute the query and get the result set
                ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            // Process the result set
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("id");
                String employeeName = resultSet.getString("name");

                // Perform some action with the retrieved data
                System.out.println("Employee ID: " +employeeId + ", Employee Name: " + employeeName);
            }
        } catch (SQLException e) {
            System.err.println("Error executing the query");
            e.printStackTrace();
        }
    }
}
