<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h2>User Registered Successfully.</h2>
	<h4>Profile INformation as follows:</h4>
	<table>
		<tr>
			<td>FirstName</td>
			<td>${eshopUser.firstName }</td>
		</tr>
		<tr>
			<td>LastName</td>
			<td>${eshopUser.lastName }</td>
		</tr>
		<tr>
			<td>UserName</td>
			<td>${eshopUser.userName }</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${eshopUser.mobile }</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${eshopUser.email }</td>
		</tr>
	</table>
</body>
</html>