package main;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

public class MenuCreate {

	    public String addMenuItems(int menuID, String name, int price, String category) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
	            PreparedStatement stmt = con.prepareStatement("INSERT INTO `Menu`(`Menu_ID`, `Name`, `Price`, `Category`) VALUES (?, ?, ?, ?)");

	            stmt.setInt(1, menuID);
	            stmt.setString(2, name);
	            stmt.setInt(3, price);
	            stmt.setString(4, category);

	            stmt.executeUpdate();
	            con.close();

	            return "Menu Updated!";
	        } 
	        catch (Exception e) {
	            e.printStackTrace(); // print the exception details to the console for debugging
	            return "Menu Updation Failed!";
	        }
	    }
	    
	    public String removeMenuItems(int menuID) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
	            PreparedStatement stmt = con.prepareStatement("DELETE FROM `Menu` WHERE `Menu_ID` = ?");

	            stmt.setInt(1, menuID);

	            int rowsAffected = stmt.executeUpdate();

	            if (rowsAffected > 0) {
	                return "Menu Item Removed!";
	            } else {
	                return "Menu Item with ID " + menuID + " not found.";
	            }
	        } 
	        catch (Exception e) {
	            e.printStackTrace();
	            return "Failed to remove menu item!";
	        }
	    }
	}



