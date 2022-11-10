package com.neiza.RedFox.Model.DAO.oldDAO;

import com.neiza.RedFox.Model.Bean.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class AdminModel {
    /* Todo: For Login on POS & Admin [selectAdminData & selectPosData]*/
    public int selectAdminData(AdminBean ad) {
        int status = 0;
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement("select * from admin where userid=? and password=? and arole=?");
            ps.setInt(1, ad.getUserid());
            ps.setString(2, ad.getPassword());
            ps.setString(3, ad.getRole());
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs == null) {
                    status = 0;
                } else {
                    status = 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    public int selectPosData(AdminBean ad) {
        int status = 0;
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement("select * from pos where username=? and password=? and prole=?");
            ps.setInt(1, ad.getUserid());
            ps.setString(2, ad.getPassword());
            ps.setString(3, ad.getRole());

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs == null) {
                    status = 0;
                } else {
                    status = 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    //------------------------------------------------------------------------

    /*Todo: For signUp on POS & Admin */
    public static void addPOS(String prole, String username, String password, String city) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = 0;
        int status = 0;
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement("insert into pos(prole,username,password,city) values(?,?,?,?)");
            ps.setString(1, prole);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, city);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //------------------------------------------------------------------------

    /* Todo: For adding shows & sites [addShow() & addSite()] */
    public int addShow(ShowBean sb) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = null;
        int show = 0;
        int id = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement("insert into show (starttime,endtime,price,movieid)values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, sb.getStarttime());
            ps.setString(2, sb.getEndtime());
            ps.setString(3, sb.getPrice());
            ps.setString(4, sb.getMovieid());
            ps.executeUpdate();
            ResultSet rs1 = ps.getGeneratedKeys();
            if (rs1.next()) {
                id = rs1.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return id;
    }
    public static int addSite(SiteBean sb) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        int status = 0;
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement("insert into Site(SiteLocation) values(?)");
            ps.setString(1, sb.getSitelocation());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    //------------------------------------------------------------------------

    /* Todo: For adding Movies [addMovies()] */
    public static int addMovie(MovieBean mb) {
        int s = 0;
        Connection con = null;
        PreparedStatement psmt = null;
        PreparedStatement ps = null;
        File f1 = new File(mb.getMovieimage());
        int id = 0;
        try {
            con = DBConnection.getConnection();
            psmt = con.prepareStatement("insert into movie(moviename,caste,genre,movieimage,movietheatreid) values(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            psmt.setString(1, mb.getMoviename());
            psmt.setString(2, mb.getCaste());
            psmt.setString(3, mb.getGenre());
            psmt.setString(5, mb.getMovietheatreid());
            FileInputStream fis = new FileInputStream(f1.getAbsolutePath());
            psmt.setBinaryStream(4, (InputStream) fis, (int) (f1.length()));
            s = psmt.executeUpdate();
        } catch (Exception e) {
            out.println(e);
        }
        return s;
    }
}