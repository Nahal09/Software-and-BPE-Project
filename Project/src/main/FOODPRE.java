package main;
import java.sql.*;
public class FOODPRE {

	public String foodprep(int PrepID, int OrderID, String Status) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
			PreparedStatement stmt=con.prepareStatement("INSERT INTO foodpreparation(Prep_ID, Order_ID, Preparation_Status) VALUES (?, ?, ?)");
			
			stmt.setInt(1, PrepID);
			stmt.setInt(2, OrderID);
			stmt.setString(3, Status);
			
			stmt.executeUpdate();
			con.close();
			
			return "Inserted succesfUlly";

		} 
		catch(Exception e)
		{
		System.out.println(e);
		}

		return "Failed!";
	}

}