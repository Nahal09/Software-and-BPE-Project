package main;

import java.sql.*;

public class Restaurant {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM deliverypersonnel");
            while (rs.next()) {
                System.out.println("Delivery_ID" + rs.getInt(1) +
                                   " 	Name: " + rs.getString(2) +
                                   " Contact " + rs.getString(3)+
                                   " Status " + rs.getString(4));
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
