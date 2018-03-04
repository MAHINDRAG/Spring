<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> using JSP EL : ${emp.empId},${emp.empName},${emp.empSal}</h1>
<h1>using jsp scripting</h1>
<%-- <%= Employee emp=(Employee)request.getAttribute("emp");
   out.print("<h1>java code Data is");
   out.print(emp.getEmpId());
   out.print(emp.getEmpName());
   out.print(emp.getEmpSal());
   out.print("</h1>");
=%> --%>

<%-- <h1>welcome to jsp :
 ${id},Name is ${name},and sal is ${sal}
 </h1>
 <h1>using Request Parameter</h1>
 <%=request.getAttribute("id") %>
 <%=request.getAttribute("name") %>
 <%=request.getAttribute("sal") %> --%>
 
</body>
</html>