<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>Register Here</h1>
	<s:form action="register" method="post" commandName="eshopUser">
	Choose: <a href="?language=en">English</a> | <a href="?language=fr">French</a> 
		<table>
			<tr>
				<td><spring:message code="registration.form.input.firstname.label"></spring:message></td>
				<td><s:input path="firstName" /></td>
				<td style="color: red"><s:errors path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><s:input path="lastName" /></td>
				<td style="color: red"><s:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter User Name</td>
				<td><s:input path="userName" /></td>
				<td style="color: red"><s:errors path="userName" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><s:password path="password" /></td>
				<td style="color: red"><s:errors path="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><s:password path="confirmPassword" /></td>
				<td style="color: red"><s:errors path="confirmPassword" /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><s:input path="email" /></td>
				<td style="color: red"><s:errors path="email" /></td>
			</tr>
			<tr>
				<td>Enter Mobile</td>
				<td><s:input path="mobile" /></td>
				<td style="color: red"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Register" /></td>
			</tr>

		</table>
	</s:form>
</body>
</html>