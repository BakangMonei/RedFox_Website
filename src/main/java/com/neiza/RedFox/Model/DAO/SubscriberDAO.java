package com.neiza.RedFox.Model.DAO;

import java.sql.*;

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
    public ResultSet verifyAdmin(String username, String password) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");
        PreparedStatement pst = connection.prepareStatement("select * from admin where userid = ? and password = ?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet resultSet = pst.executeQuery();
        return resultSet;
    }
    public ResultSet verifyUser(String username, String password) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");
        PreparedStatement pst = connection.prepareStatement("select * from pos where username = ? and password = ?");
        pst.setString(1, username);
        pst.setString(2, password);

        ResultSet resultSet = pst.executeQuery();

        return resultSet;
    }
}
