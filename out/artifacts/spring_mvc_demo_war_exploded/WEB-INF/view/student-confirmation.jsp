<%--
  Created by IntelliJ IDEA.
  User: timothywheeler
  Date: 2019-06-09
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
    <body>
    The student is confirmed: ${student.firstName} ${student.lastName}
    <br><br>
    Country: ${student.country}
    <br><br>
    Programming Language: ${student.programmingLanguage}
    <br><br>
    Operating Systems:
    <ul>
        <c:forEach var="operatingSystem" items="${student.operatingSystems}">
            <li>${operatingSystem}</li>
        </c:forEach>
    </ul>
    </body>
</html>
