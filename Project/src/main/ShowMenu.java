package main;

import java.sql.*;

public class ShowMenu {

	public MenuDetails getMenuDetails(int menuID)
	{
		MenuDetails md = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM menu where Menu_ID="+menuID);
            
            if(rs.next()) {
            	md = new MenuDetails();
            	
            	md.menuId = rs.getInt(1);
            	md.name = rs.getString(2);
            	md.price = rs.getString(3);
            	md.category = rs.getString(4);
            }
            System.out.println("Menu_ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Price: " + rs.getInt(3) + " Category: " + rs.getString(4));
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
		return md;
	}


}
