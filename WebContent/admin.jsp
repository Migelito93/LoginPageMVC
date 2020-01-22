<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="se.login.Auth" %>
<%@ page import="se.login.CookieChecker"%>

<%
Auth beanz = (Auth)request.getAttribute("Auth");
String name = beanz.getName();
String cookie = CookieChecker.getCookie(request, name);
%>
<h1>Välkommen Mr Administratör!</h1>
<h3>Hoppas din dag har varit bra. Nedan följer lite val du kan göra.</h3>
<h3><% out.print("Din favoritkaka är: " + cookie); %></h3>
<br><a href="index.jsp">Logga ut</a>