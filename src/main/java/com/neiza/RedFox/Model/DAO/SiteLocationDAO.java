package com.neiza.RedFox.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SiteLocationDAO {
    public static void addSiteLocation(String siteLocation) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");

        PreparedStatement enterSiteLocation = connection.prepareStatement("insert into site values(?)");
        enterSiteLocation.setString(1, siteLocation);
        enterSiteLocation.executeUpdate();
        enterSiteLocation.close();
    }
}
