<%--
  Created by IntelliJ IDEA.
  User: yasinmogultay
  Date: 4/13/21
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Ad</title>
</head>
<body>

<h2>Create an Ad</h2>
<form action="/ads/create" method="post">
    <label for="title">Title</label>
    <input id="title" type="text" name="title" placeholder="title">
    <label for="description">Description</label>
    <input id="description" type="text" name="description" placeholder="description">
    <button>Submit</button>
</form>

</body>
</html>
