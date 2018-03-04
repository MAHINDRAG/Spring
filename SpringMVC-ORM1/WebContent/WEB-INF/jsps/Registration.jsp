<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="?lang=te">Telugu</a>
<a href="?lang=en">English</a>
<a href="?lang=ta">Tamil</a>
<a href="?lang=kn">Kanada</a>
<h1><spring:message code="title"></spring:message></h1>
<form action="insert" method="post">
<pre>
<spring:message code="id"/> :<input type="text" name="empId"/>
<spring:message code="name"/>: <input type="text" name="empName"/>
<spring:message code="sal"/> : <input type="text" name="empSal"/>
<input type="submit" value="Insert">
</pre>
</form>
<a href="showAllRecords">View All Records</a>
</body>
</html>