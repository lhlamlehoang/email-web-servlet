<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/02/2023
  Time: 1:01 CH
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
    <h1>Thanks for joining our email list</h1>
    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>

    <label>First Name:</label>
    <span>${user.firstname}</span><br>

    <label>Last Name:</label>
    <span>${user.lastname}</span><br>

    <p>To enter another email address, click on the Back button in your browser or the Return button show nbelow.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>
