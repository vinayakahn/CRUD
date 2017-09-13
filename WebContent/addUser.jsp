<%@page import="com.jsp.crud.example.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adding New User</title>
</head>
<body>
<%@page import="com.jsp.crud.example.UserDao" %>
<jsp:useBean id="u" class="com.jsp.crud.example.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.save(u);
if(i>0)
{
	response.sendRedirect("success.html");
}
else
{
	response.sendRedirect("Error adding user");
}


%>
</body>
</html>