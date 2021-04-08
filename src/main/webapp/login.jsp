<%--
  Created by IntelliJ IDEA.
  User: yasinmogultay
  Date: 4/8/21
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("POST")) { //checking if this method is POST
        String usernameInput = request.getParameter("username");
        String passwordInput = request.getParameter("password");
        if (usernameInput.equals("admin") && passwordInput.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    }
%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1>Enter Your username and password</h1>
<form action="/login.jsp" method="post">
    <label for="username">Enter Your User Name</label>
    <input type="text" id="username" name="username" placeholder="Enter Your Username">
    <label for="password">Enter Your Password</label>
    <input type="password" id="password" name="password" placeholder="Enter Your Password">
    <button>Submit</button>
</form>
</body>
</html>