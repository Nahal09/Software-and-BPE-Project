package main;
import java.sql.*;
public class food_preparation {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from foodpreparation");

			while(rs.next())
			{
			System.out.println("Prep_ID : " + rs.getInt(1) + " Order_ID: " + rs.getInt(2) + " Preparation_Status: " + rs.getString(3));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}

}

	
