package main;
import java.sql.*;

public class Login {

	 public String login(String email, String pswrd) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
	            PreparedStatement stmt = con.prepareStatement("SELECT * FROM signup WHERE Email=? AND Password=?");
	            stmt.setString(1, email);
	            stmt.setString(2, pswrd);

	            ResultSet rs = stmt.executeQuery();

	            if (rs.next()) {
	                // User found, login successful
	                con.close();
	                return "Login successful";
	            } else {
	                // User not found or password incorrect
	                con.close();
	                return "Login failed";
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	        return "Failed!";
	    }

}
