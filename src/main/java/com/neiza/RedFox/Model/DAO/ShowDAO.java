package com.neiza.RedFox.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShowDAO {
    public static void showStuffDetails(String movieID, String startTime, String endTime, String Price) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");

        // Pos
        PreparedStatement enterShowDetails = connection.prepareStatement("insert into show values(?, ?, ?, ?)");
        enterShowDetails.setString(1, movieID);
        enterShowDetails.setString(2, startTime);
        enterShowDetails.setString(3, endTime);
        enterShowDetails.setString(4, Price);
        enterShowDetails.executeUpdate();
        enterShowDetails.close();
    }
}
