package main;

import java.sql.*;

public class Management {

	public String deliverymanagement(int DeliveryID, int OrderID, String DeliveryStatus) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO `deliverymanagement`(`Delivery_ID`, `Order_ID`, `Delivery_Status`) VALUES (?, ?, ?)");

            stmt.setInt(1, DeliveryID);
            stmt.setInt(2, OrderID);
            stmt.setString(3, DeliveryStatus);

            stmt.executeUpdate();
            con.close();

            return "Delivery Status Updated!";
        } 
        catch (Exception e) {
            e.printStackTrace(); // print the exception details to the console for debugging
            return "Delivery Status Failed!";
        }
    }
    

}
