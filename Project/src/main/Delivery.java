package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delivery {
	public DeliveryDetails getDeliveryDetails(int deliveryId)
	{
		DeliveryDetails dd = null;
		
		try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM deliverymanagement where Delivery_ID="+deliveryId);
            if(rs.next()) {
            	dd = new DeliveryDetails();
            	
            	dd.deliverId = rs.getInt(1);
            	dd.orderId = rs.getInt(2);
            	dd.status = rs.getString(3);
            	
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
		return dd;
	}
}
