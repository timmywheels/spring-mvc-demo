<%--
  Created by IntelliJ IDEA.
  User: timothywheeler
  Date: 2019-06-09
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>

    <strong>Confirmation Successful</strong>
    <br><br>
    <p>First Name: ${customer.firstName}</p>
    <p>Last Name: ${customer.lastName}</p>
    <p>Free Passes: ${customer.freePasses}</p>
    <p>ZIP Code: ${customer.zipCode}</p>
    <p>Course Code: ${customer.courseCode}</p>
</body>
</html>
