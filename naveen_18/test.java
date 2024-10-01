import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class test {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Student_Records;user=sa;password=Naveen@7300";

        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("Connected to SQL Server.");
        } catch (SQLException e) {
            System.out.println("Error connecting to SQL Server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}