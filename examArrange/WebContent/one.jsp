<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 好像要有 web.xml 文件才能使用标签...-->
<!-- javaee tools 里面的generate生成 web.xml -->
<!-- build path 还是加上吧，应该有用 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "java.util.*" %>
<%@ page import = "manyClass.*" %>
欢迎来到考试系统，今天是<% OtherUtil dnow = new OtherUtil(); %><%= dnow.showTime() %>
<hr>
<form action="">

<% 
	MysqlConnector conn = new MysqlConnector();
	conn.InitConnector();
	List<String> TyearRes = conn.getTyearFromPKe();
	String[] Tsems = {"第一学期","第二学期"}; 
	String[] Tclass = {"月考","期中考试","期末考试"};
			
	request.setAttribute("TyearRes", TyearRes);
	request.setAttribute("Tsems", Tsems);
	request.setAttribute("Tclass", Tclass);
%>
<!-- woc....EL只能取内置对象里面的值... -->

考试学年:<select name="Tyear">
		<c:forEach items="${requestScope.TyearRes} " var="result">
			<option value="${result} ">	${result }</option>		
		</c:forEach>
	  </select>
	<!-- woc...这个bug真的是见鬼了.. EL+c:forEach ArrayList 都测试没问题...放到select里面就有问题...正见鬼系列.-->

&nbsp;&nbsp;&nbsp;&nbsp;
考试学期:<select name="Tsems">
		<c:forEach items="${requestScope.Tsems}" var="Tsem" varStatus="i">
			<option value="${i.index }">${Tsem } </option>
		</c:forEach>
	   </select>
&nbsp;&nbsp;&nbsp;&nbsp;

考试类型:<select name="Tclass">
		<c:forEach items="${requestScope.Tclass}" var="Tcla" varStatus="i">
			<option value="${i.index }">${Tcla } </option>
		</c:forEach>
	   </select>
<!-- 注意考试类型/还有别的..返回的值应该是char(2) 01,02,03 的， 这里还只是0,1,2 -->
<!-- 简直神经病, 谁建的 -->
<!-- 还有一个String是char几啊... -->
&nbsp;&nbsp;&nbsp;&nbsp;

<br><br>
<!-- 先ctrl shift s，再运行， 不然运行结果千奇百怪  -->

</form>
</body>
</html>