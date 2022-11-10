package com.neiza.RedFox.Model.DAO.oldDAO;

import java.sql.*;

public class DBConnection {
    public static  Connection getConnection() {
        Connection con=null;
        try {
            String url = "jdbc:mysql://localhost:3306/Redfox";
            String user = "root";
            String pass = "MoneiBakang@959115515";
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Redfox","root", "MoneiBakang@959115515");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from admin");

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){

            System.out.println(resultSet.getString(1));

        }

    }
}
