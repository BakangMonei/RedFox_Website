package com.neiza.RedFox.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubscriberDAO {
    //
    public static void signUpSubscriber(String prole, String username, String password, String city) throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");

        // Pos
        PreparedStatement enterSubscriberDetails = connection.prepareStatement("insert into pos values(?, ?, ?, ?)");
        enterSubscriberDetails.setString(1, prole);
        enterSubscriberDetails.setString(2, username);
        enterSubscriberDetails.setString(3, password);
        enterSubscriberDetails.setString(4, city);
        enterSubscriberDetails.executeUpdate();
        enterSubscriberDetails.close();
    }
}
