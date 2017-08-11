<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">Create Admin Form</h1>
	<div align="center" style="outline: blue; border: medium;">

		<table style="font-size: 20px" cellpadding="10">

			<form:form method="post" action="/save_admin" modelAttribute="admin">
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName"
							placeholder="Enter First Name" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" placeholder="Enter Last Name" />
					</td>
				</tr>
				<tr>
					<td>Email Address:</td>
					<td><form:input path="email" placeholder="Enter Email Address" />
					</td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input type="password" path="password"
							placeholder="Enter Password" /></td>
				</tr>
				<tr>
					<td><form:button
							style="padding: 16px 16px; font-size: 20px; text-align: center;"
							value="Save">Save</form:button></td>
					<td><input
						style="padding: 15px 16px; font-size: 20px; text-align: center;"
						type="button" onclick="location.href='/'" value="Back"></td>
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>