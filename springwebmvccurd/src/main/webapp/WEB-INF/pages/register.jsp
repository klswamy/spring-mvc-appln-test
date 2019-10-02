<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#rcorners {
    border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px;
    width: 500px;
    height: 300px;
 align-self:center;;
}
</style>

</head>
<body>
<div  id="rcorners">
<h1 style="color: green;">Welcome to Registration process</h1>
<form action="reg" method="post">
<table>
<tr><th>

First Name :</th><td><input type="text" name="frstName"/></td></tr>
<tr><th>Last Name:</th><td><input type="text" name="lastName"/></td></tr>
<tr><th>Email:</th><td><input type="text" name="email"/></td></tr>
<tr><th>Phone Number:</th><td><input type="text" name="ph"/></td></tr>
<tr><th>Date Of Birth</th><td><input type="date" name="dob"/></td></tr>
<tr><th><td><input type="submit" value="Register"/></td></tr>
</table>
</form>
${msg}
<h3><a href="getAll">Get All Employees</a></h3>
</div>
</body>
</html>