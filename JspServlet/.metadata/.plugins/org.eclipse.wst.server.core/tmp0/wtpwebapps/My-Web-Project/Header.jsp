<%@page import="com.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	UserBean userbean = (UserBean) session.getAttribute("user");
	%>

	<%
	if (userbean != null) {
	%>

	<h2><%="Hii, " + userbean.getFirstName()%></h2>
	<a href="LoginCtl?operation=logout">logout</a>
	<a href=" UserCtl.do"> Add User </a>
	<a href=" UserListCtl.do"> User list </a>
	<%
	} else {
	%>
	<h2>Hii, Guest</h2>
	<a href="LoginCtl"> Login</a>|
	<a href="WelcomeCtl">Welcome </a>|
	<a href="UserRegistrationCtl">User Registration </a>

	<%
	}
	%>


	<hr>

</body>
</html>