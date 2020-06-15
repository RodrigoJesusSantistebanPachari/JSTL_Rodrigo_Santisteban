<%@page import="com.javarevolutions.jsps.servlets.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserLogged</title>
</head>
<body>
<p style = "font-weight: bolt; font-size: 20px; ">
WELCOME TO THIS PAGE, YOU WILL LEARN TO SPEAK ENGLISH HERE <%=((VOLogin) request.getAttribute("UserLogged")).getNombre() %>
</p><br><br><br>
<p>VERB TO BE:</p><br><br>
<p>I am</p><br>
<p>You are</p><br>
<p>He is</p><br>
<p>She is</p><br>
<p>It is</p><br>
<p>We are</p><br>
<p>You are</p><br>
<p>They are</p><br>

</body>
</html>