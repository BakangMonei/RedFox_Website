package com.neiza.RedFox.Model.DAO;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieDAO {
    public static void addMovie(String movieName, String Caste, String Genre, String movieImage, String movieTheatreID) throws SQLException{
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/redfox", "root", "MoneiBakang@959115515");


        PreparedStatement enterMovieDetails = connection.prepareStatement("insert into movie values(?, ?, ?, ?, ?)");
        enterMovieDetails.setString(1, movieName);
        enterMovieDetails.setString(2, Caste);
        enterMovieDetails.setString(3, Genre);
        enterMovieDetails.setString(4, movieImage);
        enterMovieDetails.setString(5, movieTheatreID);
        enterMovieDetails.executeUpdate();
        enterMovieDetails.close();
    }
}
