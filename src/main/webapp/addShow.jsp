<%--
  Created by IntelliJ IDEA.
  User: cse20-018
  Date: 02/11/2022
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css">

    <title>Show Entry Page</title>
</head>
<body>
<div id="login-box">
    <div class="left">
        <h1>Add Show</h1>
        <form action="ShowAction" enctype="multipart/form-data">
            <input type="time" name="starttime" placeholder="Enter Show Start Time" />
            <input type="time" name="endtime" placeholder="Enter Show End Time" />
            <input type="text" name="price" placeholder="Show Price" />
            <input type="text" name="movieid" placeholder="Movie ID" />
            <input type="submit" value="Add" />
    </div>
</div>
</form>






</body>
</html>

