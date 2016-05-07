<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page import="com.example.PersonUtil"%>
		<%
	String task = request.getParameter("task");
	int userId = Integer.parseInt(request.getParameter("userId"));
	String result = "";

	PersonUtil pu = new PersonUtil();
	try{
		   pu.addTask(task, userId);
		   result = "1";
	}
	catch(Exception e){
		result ="0";
	 }
	
%>
<%=result%>