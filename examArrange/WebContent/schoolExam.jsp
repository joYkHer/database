<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import = "java.sql.*" %>
<%@ page import ="java.util.*" %>

<%
	ArrayList a = new ArrayList();
	a.add("aa");
	a.add("bb");
	request.setAttribute("tes", a);
%>

<c:forEach items="${requestScope.tes }" var="te">
${te }

</c:forEach>
	
</body>
</html>