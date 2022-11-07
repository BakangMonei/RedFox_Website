<%--
  Created by IntelliJ IDEA.
  User: cse20-018
  Date: 02/11/2022
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.neiza.RedFox.Model.Bean.MovieBean" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Select Movie Page</title>
</head>
<body>
<h1>Selected Movie Data</h1>
<%
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    MovieBean mb=new MovieBean();
    try {
        String url = "jdbc:mysql://localhost:3306/Redfox";
        String user = "root";
        String pass = "MoneiBakang@959115515";
        con = DriverManager.getConnection(url, user, pass);
    }
    catch(Exception e) {
        out.println(e);
    }
    String sql ="SELECT movieid from Movie where moviename=?";
    st = con.prepareStatement(sql);
    st.setString(1, request.getParameter("movie"));
    rs = st.executeQuery();
    rs.next();
    int movieid = rs.getInt(1);
    String sql1 = "SELECT m.movieid,m.moviename,s.starttime,s.endtime,s.price from movie m,show s where s.movieid=m.movieid and m.movieid=? ";
    PreparedStatement st2 = null;
    st2 = con.prepareStatement(sql1);

    st2.setInt(1, movieid);
    rs1 = st2.executeQuery();
    if(rs1.next()){
%>
<table>
    <br>   Movie ID        : <%= rs1.getString(1)%></br>
    <br>   Movie Name      : <%= rs1.getString(2)%></br>
    <br>   Show Start Time : <%= rs1.getString(3)%></br>
    <br>   Show End Time   : <%= rs1.getString(4)%></br>
    <br>   Movie Price     : <%= rs1.getString(5)%></br>
    <%
        }
    %>
</table>
</body>
</html>