package main;

import java.sql.*;

public class Menu {

	public static void main(String[] args) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from menu");

				while(rs.next())
				{
				System.out.println("Menu_ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Price: " + rs.getInt(3) + " Category: " + rs.getString(4));
				}
				con.close();
				} catch(Exception e)
				{
				System.out.println(e);
				}

	}

}
