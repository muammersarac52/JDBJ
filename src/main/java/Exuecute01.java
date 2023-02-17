import java.sql.*;

public class Exuecute01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5421/Techproed",
                "postgres","1234");
        Statement st = con.createStatement();
        System.out.println("Connection Success");
    }
}

