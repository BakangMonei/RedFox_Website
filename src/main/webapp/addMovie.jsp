<%--
  Created by IntelliJ IDEA.
  User: cse20-018
  Date: 02/11/2022
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>

<%@page import="java.sql.PreparedStatement"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="com.neiza.RedFox.Model.Bean.MovieTheatre" %>
<%@ page import="com.neiza.RedFox.Model.Bean.MovieBean" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    MovieTheatre mt=new MovieTheatre();
    try
    {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:mysql://localhost:3306/Redfox";
        String user = "root";
        String pass = "MoneiBakang@959115515";
        con = DriverManager.getConnection(url, user, pass);
    }
    catch(Exception e)
    {
        out.println(e);
    }
    String sql ="SELECT movietheatreid from movietheatre";
    st=con.createStatement();
    rs = st.executeQuery(sql);


%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css">
    <title>Movie Entry Page</title>
</head>
<body>
<div id="login-box">
    <div class="left">
        <h1>Add Movie</h1>
        <form action="movieAction" enctype="multipart/form-data">
            <input type="text" name="moviename" placeholder="MovieName" />
            <input type="text" name="caste" placeholder="MovieCast" />
            <input type="text" name="genre" placeholder="MovieGenre" />
            <select name="movietheatre">
                <option >Select Movie Theater Id</option>
                <h2></h2>
                <%
                    while(rs.next()){
                %>
                <option  name="Select MovieTheatreID" value="<%= rs.getString("movietheatreid")%>"><%= rs.getString("movietheatreid") %></option>
                <%
                    }
                %>
            </select>
            <input type="file" name="movieimage" placeholder="MovieTheatreNumber"/>
            <input type="submit" value="Add" />
    </div>
</div>
</form>
</body>
</html>

