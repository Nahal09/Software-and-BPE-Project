package main;

import java.sql.*;

public class Restaurant {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM deliverymanagement");
            while (rs.next()) {
            	int Delivery_ID=rs.getInt(Delivery_ID),
            int Order_ID=rs.getInt(Order_ID),	
                System.out.println("Delivery_ID" + rs.getInt(1) +
<<<<<<< Updated upstream
                        " 	Name: " + rs.getString(2) +
                        " Contact " + rs.getString(3)+
                        " Status " + rs.getString(4));
                                   " Order_ID: " + rs.getInt(1) +
                                   " Delivery_Status " + rs.getString(3));
>>>>>>> Stashed changes
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
