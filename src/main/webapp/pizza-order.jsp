<%--
  Created by IntelliJ IDEA.
  User: yasinmogultay
  Date: 4/12/21
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form method="POST">
    <label for="crustType">Enter your crust Type</label>
    <input type="text" id="crustType" name="crustType" placeholder="Select crust type"><br>
    <label for="sauceType">Enter your sauce Type</label>
    <input type="text" id="sauceType" name="sauceType" placeholder="Select sauce type"><br>
    <label for="crustType">Selcet size</label>
    <select name="size" id="size">
        <option value="s">S</option>
        <option value="m">M</option>
    </select><br>
    <input type="checkbox" id="topping1" name="vehicle1" value="Bike">
    <label for="topping1">Topping 1</label><br>
    <input type="checkbox" id="topping2" name="vehicle2" value="Car">
    <label for="topping2">Topping 2</label><br>
    <input type="text" name="adress" placeholder="Enter address"> <br>
    <button>Submit</button>
</form>
</body>
</html>
