<%--
  Created by IntelliJ IDEA.
  User: timothywheeler
  Date: 2019-06-08
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${param.studentName} | Form</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
</head>
<body>
    Hello World of Spring
    <hr/>
    <p>Student Name: ${param.studentName}</p>

    <hr/>
    <p>Formatted Data: ${message}</p>
</body>
</html>
