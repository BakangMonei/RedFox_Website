package com.neiza.RedFox.Model.Bean;

import java.util.Objects;

public class SiteBean {
    // Attributes
    String sitelocation;

    // Empty Constructor
    public SiteBean(){
    }

    // Constructor
    public SiteBean(String sitelocation) {
        this.sitelocation = sitelocation;
    }

    // Getters & Setters
    public String getSitelocation() {
        return sitelocation;
    }
    public void setSitelocation(String sitelocation) {
        this.sitelocation = sitelocation;
    }

    // toString() methods
    @Override
    public String toString() {
        return "SiteBean[" +
                "sitelocation: " + sitelocation + '\'' +
                ']';
    }

    // hashCodes() & equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SiteBean siteBean = (SiteBean) o;
        return sitelocation.equals(siteBean.sitelocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sitelocation);
    }
}