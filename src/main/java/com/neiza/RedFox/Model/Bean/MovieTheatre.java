package com.neiza.RedFox.Model.Bean;

import java.util.Objects;

public class MovieTheatre {
    // Attributes
    String movietheatreid;

    // Empty Constructor
    public MovieTheatre(){
    }

    // Constructor
    public MovieTheatre(String movietheatreid) {
        this.movietheatreid = movietheatreid;
    }

    // Setters & Getters
    public String getMovietheatreid() {
        return movietheatreid;
    }
    public void setMovietheatreid(String movietheatreid) {
        this.movietheatreid = movietheatreid;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieTheatre that = (MovieTheatre) o;
        return movietheatreid.equals(that.movietheatreid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movietheatreid);
    }
}
