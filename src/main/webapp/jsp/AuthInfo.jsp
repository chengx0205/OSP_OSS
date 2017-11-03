<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>


<body>
	<div>
	<table>
		<c:forEach var="auth" items="${Auth}">
		<tr>
			<td>${auth.authId}</td>
		</tr>
		<tr>
			<td>${auth.authName}</td>
		</tr>
		<tr>
			<td>${auth.authPath}</td>
		</tr>
		<tr>
			<td>${auth.authDescription}</td>
		</tr>
		<tr>
			<td>${auth.iconCls}</td>
		</tr>
		<tr>
			<td>${auth.parentId}</td>
		</tr>
		</c:forEach>
	</table>
	
	</div>
</body>
</html>