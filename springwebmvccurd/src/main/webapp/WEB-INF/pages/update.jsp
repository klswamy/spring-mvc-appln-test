<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>Welcome To Update Page</h2>
<form action="Update" method="post">
<table>
<tr><th>EmpId</th><td><input type="text" name="empId" value="${emp.empId}" readonly="readonly"/></td></tr>

<tr><th>First Name :</th><td><input type="text" name="frstName" value="${emp.frstName}"/></td></tr>
<tr><th>Last Name:</th><td><input type="text" name="lastName" value="${emp.lastName}"/></td></tr>
<tr><th>Email:</th><td><input type="text" name="email" value="${emp.email}"/></td></tr>
<tr><th>Phone Number:</th><td><input type="text" name="ph" value="${emp.ph}"/></td></tr>

<tr><th>Date of Birth:</th><td><input type="date" name="dob" value="${emp.dob}"/></td></tr>
<tr><th><td><input type="submit" value="Update"/></td></tr>
</table>
</form>
</div>
</body>
</html>