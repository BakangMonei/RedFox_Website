package com.neiza.RedFox.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminDAO {
    public static void signUpAdmin(String userID, String password, String role) throws SQLException{
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");

        PreparedStatement enterAdminDetails = connection.prepareStatement("insert into admin values(?, ?, ?)");
        enterAdminDetails.setString(1, userID);
        enterAdminDetails.setString(2, password);
        enterAdminDetails.setString(3, role);
        enterAdminDetails.executeUpdate();
        enterAdminDetails.close();
    }
}
