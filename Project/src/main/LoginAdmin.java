package main;
import java.sql.*;

public class LoginAdmin {

    public String adminlogin(String email, String pswrd) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM adminsignup WHERE Email=? AND Password=?");
            stmt.setString(1, email);
            stmt.setString(2, pswrd);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Admin found, login successful
                con.close();
                return "Login successful";
            } else {
                // Admin not found or password incorrect
                con.close();
                return "Login failed";
            }
        } catch (Exception e) {
            System.out.println(e);
            return "Failed!";
        }
    }
}
