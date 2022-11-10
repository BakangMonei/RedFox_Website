package com.neiza.RedFox.Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieTheatreDAO {
    public static void addMovieTheatre(String movieTheatreID) throws SQLException{
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");

        PreparedStatement enterMovieTheatreDetails = connection.prepareStatement("insert into movietheatre values(?)");
        enterMovieTheatreDetails.setString(1, movieTheatreID);
        enterMovieTheatreDetails.executeUpdate();
        enterMovieTheatreDetails.close();
    }
}
