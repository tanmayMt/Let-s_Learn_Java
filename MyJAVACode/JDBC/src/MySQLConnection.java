import java.sql.*;

public class MySQLConnection {
        static final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
        static final String url = "jdbc:mysql://localhost:3306/tanmay_db";
        static final String username = "root";
        static final String password = "Tanmoy3011d7$o";

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName(jdbcDriver);

            // Establish the connection
            con = DriverManager.getConnection(url,username, password);
            System.out.println("Connected to MySQL database: tanmay_db");
            
            stmt=con.createStatement();
            String i = "INSERT INTO EMPLOYEE VALUES (19,'Bishal Sen','Kolkata',92000)";
            String d = "DELETE FROM EMPLOYEE WHERE E_NO=19";
            String r = "select * from EMPLOYEE";
            stmt.executeUpdate(d);

            
            // Close the connection
            con.close();
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}