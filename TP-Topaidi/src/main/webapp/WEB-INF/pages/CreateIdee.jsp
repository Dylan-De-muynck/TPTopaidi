<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<meta charset="ISO-8859-1">
<title>TP Top</title>

<%@ include file="commons/header.jsp" %>

</head>

<body>
<div class="container">
<%@ include file="commons/menu.jsp" %>

	<h1>Creation Idée</h1>
	
	<form action="Idee" method="post">
	   <label for="titreIdee">Titre de l'idée :</label> 
	   <input type="text" name="titreIdee">
	   <label for="descriptionIdee">Description :</label> 
	   <input type="number" name="descriptionIdee">
	   <label for="categorieIdee">Catégorie :</label> 
	   <input type="number" name="categorieIdee">
	   <label for="imageIdee">Image :</label>
	   <input type="number" name="imageIdee">
	   <input type="hidden" value="formCreate" name="actionPost">
	   <input type="submit" value="Valider">
 	</form>
 	<p>User connecté : <c:out value="${ User }"></c:out></p>
 	
</div>
</body>
</html>