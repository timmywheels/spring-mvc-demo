<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName"/>
        <br><br>
        Last Name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>
        <br><br>
        Language:
        <form:radiobuttons path="programmingLanguage" items="${student.programmingLanguages}" />
        <br><br>
        OSX <form:checkbox path="operatingSystems" value="OSX" />
        Windows <form:checkbox path="operatingSystems" value="Windows" />
        Linux <form:checkbox path="operatingSystems" value="Linux" />
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>

</body>
</html>
