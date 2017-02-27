<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Laporan</title>
	</head>
	<body>
	<form:form method="POST" ModelAttribute="reportBean" action="">
		<table>
		<tr>
			<td>Username : </td>
			<td>Dodo</td>
			<td>
				<input type="submit" value="Search"/>
				<input type="submit" value="Add"/>
				<input type="submit" value="Edit"/>
				<input type="submit" value="Delete	"/>
			</td>
		</tr>
			<td>Tanggal Aawal :</td>
				<td><input type="teks" value="Search"/></td>
				<td>
					<label>Total Pengeluaran :<label>
					<label>Rp. 12.000</label>
				</td>
		<tr>
		</tr>
			<td>Tanggal Akhir :</td>
				<td><input type="teks" value="Search"/></td>
		<tr>
		
		</tr>
		</table>
		
		<table border="1">
				<tr>
					<th>Check</th>
					<th>Tanggal</th>
					<th>Deskripsi</th>
					<th>Jumlah</th>
				</tr>
				<tbody>
				<c:forEach items="${reports}" var="report">
					<tr>
						<td><form:checkbox path="checkId" value="${report.id}" /></td>
						<td><c:out value="${report.tanggal}"/></td>
						<td><c:out value="${report.deskripsi}"/></td>
						<td><c:out value="${report.jumlah}"/></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</form:form>  
	</body>
</html>