import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/university_db";
    private static final String USER = "postgres";   // немесе Miko1234567
    private static final String PASSWORD = "1234";


    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver"); // 🔥 МІНДЕТТІ
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
