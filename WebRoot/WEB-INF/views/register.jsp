<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Register</title>
	</head>
	<body>
		<h2>Register</h2>
		<form:form method="POST" ModelAttribute="loginBean" action="create_user.html">
	   		<table>
			    <tr>
			        <td><form:label  path="username">Username :</form:label></td>
			        <td><form:input required="required" path="username" value="${loginBean.username}"/></td>
			 
			    </tr>
			    <tr>
			        <td><form:label path="email">Email:</form:label></td>
			        <td><form:input required="required" path="email" value="${loginBean.email}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="password">Password:</form:label></td>
			        <td><form:input required="required" type="password" path="password" value="${loginBean.password}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="retypePassword">Retype-Password:</form:label></td>
			        <td><form:input required="required" type="password" path="retypePassword" value="${loginBean.retypePassword}"/></td>
			    </tr>
			    <tr>
			    	<td>
			    	${message}
			    	</td>
			    </tr>
			    <tr>
			      <td><input type="submit" value="Daftar"/>
			      		<a href="login.html"><input type="reset" value="Cancel"/></a>
			      </td>
			      <td></td>
		      </tr>
			</table> 
		</form:form>
		
  
	</body>
</html>