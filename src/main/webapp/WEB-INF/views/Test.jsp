<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	
<%@ page session="false" %>
<html>
<head>
	<title>Test</title>
</head>
<body>
<h1>
	Test Project 
</h1>
<table border="1">
<tr>
	<th>번호</th><th>이름</th>
</tr>	
<c:forEach items = "${resultlist}" var = "v">
<tr>
	<td>${v.no}</td>
	<td>${v.name}</td>
</tr>
</c:forEach>
</table>
</body>
</html>