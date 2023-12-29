package main;

import java.sql.*;

public class Management {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from deliverymanagement");

			while(rs.next())
			{
				int Delivery_ID=rs.getInt(1);
			     int Order_ID=rs.getInt(2);
			System.out.println("Delivery_ID: " + rs.getInt(1) + " Order_ID: " + rs.getInt(2) + " Delivery_Status: " + rs.getString(3) + " Estimated_Delivery_Time: " + rs.getString(4));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}

}
