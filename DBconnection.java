package food.ordering.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 public class DBconnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/food_ordering";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "YOUR_PASSWORD";

    public static Connection getConnection() {

        try {
           
            Connection con = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );

            return con;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Database Connection Error: " + e.getMessage()
            );

            return null;
        }
    }
}