<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page import="com.example.PersonUtil"%>
		<%
	String user = request.getParameter("user");
	String password = request.getParameter("password");

	PersonUtil pu = new PersonUtil();
	StringBuffer result = pu.login(user, password);
	
%>
			<%=result%>