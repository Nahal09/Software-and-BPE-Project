package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddtoCart {

	public MenuDetails addtocart(int menuID)
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
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
		return md;
	}


}
