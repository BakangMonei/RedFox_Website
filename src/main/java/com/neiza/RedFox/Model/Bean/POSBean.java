package com.neiza.RedFox.Model.Bean;

import java.util.Objects;

public class POSBean {
    // Attributes
    String uName, password, City, prole;

    // Empty Constructor
    public POSBean(){
    }

    // Constructors
    public POSBean(String uName, String password, String city, String prole) {
        this.uName = uName;
        this.password = password;
        City = city;
        this.prole = prole;
    }

    // Getters and Setters
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public String getProle() {
        return prole;
    }
    public void setProle(String prole) {
        this.prole = prole;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POSBean posBean = (POSBean) o;
        return uName.equals(posBean.uName) && password.equals(posBean.password) && City.equals(posBean.City) && prole.equals(posBean.prole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uName, password, City, prole);
    }

    // toString() methods
    @Override
    public String toString() {
        return "POSBean[" +
                "uName: " + uName + '\'' +
                ", password: " + password + '\'' +
                ", City: " + City + '\'' +
                ", prole: " + prole + '\'' +
                ']';
    }
}

