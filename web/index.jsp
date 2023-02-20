<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/02/2023
  Time: 12:48 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>Email Servlet</title>
  <link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
<h1>Join our email list</h1>
<p>To join our email list, enter your name and email address below</p>

<form action="emailList" method="post">
  <input type="hidden" name="action" value="add">

  <label>Email:</label>
  <input type="email" name="email" required><br>

  <label>First Name:</label>
  <input type="text" name="firstname" required><br>

  <label>Last Name:</label>
  <input type="text" name="lastname" required><br>

  <label>&nbsp;</label>
  <input type="submit" value="Join Now" id="submit">

</form>
</body>
</html>

