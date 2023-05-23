<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TOP</title>
</head>
<body>
	<ul>
		<% for(String c : (ArrayList<String>) request.getAttribute("classes")) { %>
			<li><a href=<%= c %>><%= c %></a></li>
		<% } %>
	</ul>
	<img src="./static/img/a.png">
</body>
</html>