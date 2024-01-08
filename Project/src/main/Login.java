package main;
import java.sql.*;

public class Login {

	 public String login(String email, String pswrd) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
	            Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select Email,password from signup where Email='"+email+"' and password='"+pswrd+"'");

				while(rs.next()){
					String Email = rs.getString(1);
					String password = rs.getString(2);
				}
				con.close();
			} catch(Exception e){
				System.out.println(e);
			}

	        return "" ;
	    }

}
