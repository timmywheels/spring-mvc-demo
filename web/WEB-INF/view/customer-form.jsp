<%--
  Created by IntelliJ IDEA.
  User: timothywheeler
  Date: 2019-06-09
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
</head>
<body>
    <form:form action="processForm" modelAttribute="customer">
        First Name: <form:input path="firstName" />
        <form:errors path="firstName" cssClass="error"/>
        <br><br>
        Last Name: <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Free Passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        ZIP Code: <form:input path="zipCode" />
        <form:errors path="zipCode" cssClass="error"/>
        <br><br>
        Course Code: <form:input path="courseCode" />
        <form:errors path="courseCode" cssClass="error"/>
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
