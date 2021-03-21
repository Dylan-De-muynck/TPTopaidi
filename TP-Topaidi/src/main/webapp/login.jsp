<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<meta charset="ISO-8859-1">
<title>TP Top</title>
<%@ include file="/WEB-INF/pages/commons/header.jsp" %>

</head>

<body>
<div class="container">
<%@ include file="/WEB-INF/pages/commons/menu.jsp" %>

	<form method="POST" action="j_security_check">
		<input type="text" name="j_username"> 
		<input type="password" name="j_password">
		<input type="submit" value="se connecter">
	</form>
	
</div>
</body>
</html>