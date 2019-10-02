<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="border: navy;">
<h2 style="color: green;">Welcome To Employee Data</h2>
<c:if test="${ not empty list}">
<table border="2">
<tr>
                        <th>EmpId</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Email</th>
						<th>PhoneNumber</th>
						<th>DOB</th>
						<th colspan="2">Operations</th>
						
					</tr>
<c:forEach items="${list}" var="list">
<tr>                           
                            <td><c:out value="${list.empId}" /></td>
							<td><c:out value="${list.frstName}" /></td>
							<td><c:out value="${list.lastName}" /></td>
							<td><c:out value="${list.email}" /></td>
							<td><c:out value="${list.ph}" /></td>
							<td><c:out value="${list.dob}"/></td>
							<td><a href="delete?empId=${list.empId}">DELETE</a></td>
							<td><a href="edit?empId=${list.empId}">EDIT</a></td>
						</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${empty list}"><h3 style="color: red;"><c:out value="Records Not Found"/></h3></c:if>
<h3><a href="save">Register Employee</a></h3>
</div>
</body>
</html>