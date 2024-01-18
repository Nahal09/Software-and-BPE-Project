package main;

import java.sql.*;

public class SignupAdmin {

	public String adminsignup(String FirstName,String LastName,String email,int phn,String add,String pswrd) {
		
		try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
					PreparedStatement stmt=con.prepareStatement("INSERT INTO `adminsignup`(`First_Name`, `Last_Name`, `Email`, `Phone_Number`, `Address`, `Password`) VALUES (?, ?, ?, ?, ?, ?)");
					
					stmt.setString(1, FirstName);
					stmt.setString(2, LastName);
					stmt.setString(3, email);
					stmt.setInt(4, phn);
					stmt.setString(5, add);
					stmt.setString(6, pswrd);
					
					stmt.executeUpdate();
					con.close();
					
					return "Inserted succesfUlly";
				} catch(Exception e)
				{
				System.out.println(e);
				}
		
				return "Failed!";
			}

}
