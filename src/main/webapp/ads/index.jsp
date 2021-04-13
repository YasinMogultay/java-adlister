<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yasinmogultay
  Date: 4/13/21
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Page</title>
</head>
<body>

<h1>Ads</h1>

<c:forEach var="ad" items="${ads}">
    <div>
        <h3>User Id: ${ad.userId}</h3>
        <h3>Title: ${ad.title}</h3>
        <h3>Description: ${ad.description}</h3>
    </div>
</c:forEach>
</body>
</html>
