<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table tr, th {
	color: cyan background-color:yellow;
}
</style>

</head>
<body>
	<h1>Data is</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Operation</th>
		</tr>
		<c:forEach items="${empList}" var="emp">
			<tr>
				<td><c:out value="${emp.empId}" /></td>
				<td><c:out value="${emp.empName}" /></td>
				<td><c:out value="${emp.empSal}" /></td>
				<td><a href="delete/<c:out value="${emp.empId}"/>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="reg">GoTo Home Page</a>
</body>
</html>