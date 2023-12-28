package main;

import java.sql.*;

public class Invoice {

    public void createInvoice(int personnelContact , String foodName, int foodPrice, int orderID , int deliveryID ) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT deliverypersonnel.Contact AS PersonnelContact, menu.Name AS FoodName, menu.Price AS FoodPrice, deliverymanagement.Order_ID, deliverymanagement.Delivery_ID FROM deliverypersonnel join menu on deliverypersonnel.Delivery_ID=menu.Menu_ID");

            while (rs.next()) {
                personnelContact = rs.getInt("PersonnelContact");
                foodName = rs.getString("FoodName");
                foodPrice = rs.getInt("FoodPrice");
                orderID = rs.getInt("Order_ID");
                deliveryID = rs.getInt("Delivery_ID");

                System.out.println("Delivery_ID: " + deliveryID + ", Food Name: " + foodName + ", Personnel Contact: " + personnelContact + ", Food Price: " + foodPrice + ", Order_ID: " + orderID);
            }


            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
