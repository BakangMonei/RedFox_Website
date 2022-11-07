<%--
  Created by IntelliJ IDEA.
  User: cse20-018
  Date: 02/11/2022
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>POS Registration Page</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="login-box">
  <div class="left">
    <h1>Register</h1>
    <form action="POSAction">
      <input type="text" name="role" placeholder="Role" />
      <input type="text" name="uName" placeholder="Username" />
      <input type="text" name="city" placeholder="City" />
      <input type="password" name="password" placeholder="Password" />
      <input type="submit" value="Register" />
  </div>
</div>
</form>
</body>
</html>