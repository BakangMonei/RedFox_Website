package com.neiza.RedFox.Model.Bean;

import java.util.Objects;

public class MovieBean {
    // Attributes
    String moviename, caste, genre, movieimage, movietheatreid;

    // Empty Constructor
    public MovieBean(){}

    // Constructors
    public MovieBean(String moviename, String caste, String genre, String movieimage, String movietheatreid) {
        this.moviename = moviename;
        this.caste = caste;
        this.genre = genre;
        this.movieimage = movieimage;
        this.movietheatreid = movietheatreid;
    }

    // Getters and Setters
    public String getMoviename() {
        return moviename;
    }
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    public String getCaste() {
        return caste;
    }
    public void setCaste(String caste) {
        this.caste = caste;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getMovieimage() {
        return movieimage;
    }
    public void setMovieimage(String movieimage) {
        this.movieimage = movieimage;
    }
    public String getMovietheatreid() {
        return movietheatreid;
    }
    public void setMovietheatreid(String movietheatreid) {
        this.movietheatreid = movietheatreid;
    }

    // hashCodes() and equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieBean movieBean = (MovieBean) o;
        return moviename.equals(movieBean.moviename) && caste.equals(movieBean.caste) && genre.equals(movieBean.genre) && movieimage.equals(movieBean.movieimage) && movietheatreid.equals(movieBean.movietheatreid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(moviename, caste, genre, movieimage, movietheatreid);
    }

    // toString() methods

    @Override
    public String toString() {
        return "MovieBean[ " +
                "moviename: " + moviename + '\'' +
                ", caste: " + caste + '\'' +
                ", genre: " + genre + '\'' +
                ", movieimage: " + movieimage + '\'' +
                ", movietheatreid: " + movietheatreid + '\'' +
                ']';
    }
}
