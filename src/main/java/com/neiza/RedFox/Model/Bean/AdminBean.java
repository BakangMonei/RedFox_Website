package com.neiza.RedFox.Model.Bean;

import java.util.Objects;

public class AdminBean {
    // Attributes
    int userid;
    String password, role;

    // Empty Constructors
    public AdminBean() {
    }

    // Constructors
    public AdminBean(int userid, String password, String role) {
        this.userid = userid;
        this.password = password;
        this.role = role;
    }

    // Setters and Getters
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // hashCodes() & equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminBean adminBean = (AdminBean) o;
        return userid == adminBean.userid && password.equals(adminBean.password) && role.equals(adminBean.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, password, role);
    }

    // toString() methods
    @Override
    public String toString() {
        return "AdminBean[ " +
                "userid: " + userid +
                ", password: " + password + '\'' +
                ", role: " + role + '\'' +
                ']';
    }
}

