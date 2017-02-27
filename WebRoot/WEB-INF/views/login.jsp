<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<h2>Login</h2>
		<form:form method="POST" action="login.html">
	   		<table border="1">
			    <tr>
			        <td><form:label path="username">Username:</form:label></td>
			        <td><form:input path="username" value="${loginBean.username}"/></td>
			 
			    </tr>
			    <tr>
			        <td><form:label path="password">Password:</form:label></td>
			        <td><form:input type="password" path="password" value="${loginBean.password}"/></td>
			    </tr>
			    <tr>
			    	<td colspan="1">
			    	${message}
			    	</td>
			    </tr>
			    <tr>
			      <td><input type="submit" value="Submit"/></td>
			      <td><a href="register.html"><input type="button" value="Daftar"/></a></td>
		      </tr>
			</table>
		</form:form>
		
		
  
	</body>
</html>