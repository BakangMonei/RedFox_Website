package com.neiza.RedFox.Model.Bean;

import java.util.Objects;

public class ShowBean {
    // Attributes
    String starttime, endtime, price, movieid;

    // Empty Constructor
    public ShowBean(){
    }

    // Constructors
    public ShowBean(String starttime, String endtime, String price, String movieid) {
        this.starttime = starttime;
        this.endtime = endtime;
        this.price = price;
        this.movieid = movieid;
    }

    // Getters & Setters
    public String getStarttime() {
        return starttime;
    }
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }
    public String getEndtime() {
        return endtime;
    }
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getMovieid() {
        return movieid;
    }
    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    // toString() methods
    @Override
    public String toString() {
        return "ShowBean[" +
                "starttime: " + starttime + '\'' +
                ", endtime: " + endtime + '\'' +
                ", price: " + price + '\'' +
                ", movieid: " + movieid + '\'' +
                ']';
    }

    // equals() & hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowBean showBean = (ShowBean) o;
        return starttime.equals(showBean.starttime) && endtime.equals(showBean.endtime) && price.equals(showBean.price) && Objects.equals(movieid, showBean.movieid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(starttime, endtime, price, movieid);
    }
}
