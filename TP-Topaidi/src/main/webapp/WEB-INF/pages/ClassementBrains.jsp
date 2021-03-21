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
 	
 	<h2>Classement Brains</h2>

<table>
    <thead>
        <tr>
            <th>Titre</th>
            <th>Description</th>
            <th>Catégorie</th>
            <th>Image</th>
            <th>Notes</th>
        </tr>
    </thead>



	<tbody>
		<c:forEach items="${Idees}" var="Idee"><!-- Idees TO Notation with jointure -->
		<tr>
			<td>
			<c:out value="${Idee.titre}"/>
			</td>
			<td>
			<c:out value="${Idee.description}"/>
			</td>
			<td>
			<c:out value="${Idee.categorie}"/>
			</td>
			<td>
			<c:out value="${Idee.urlImage}"/>
			</td>
			<td>
			
			<c:if test="${ note.notes = Top  }">
			<h4>Top</h4>
			</c:if>
			
			<c:if test="${ note.notes = Flop  }">
			<h4>Flop</h4>
			</c:if>
			
			<c:if test="${ empty note.notes && note.utilisateur.nom != User }">
			<a>Top</a>
			<a>Flop</a>
			</c:if>
			
			</td>
			<td>
			<a href="?Comment=${ Idee.Titre }">Comment</a>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
 	
 	
</div>
</body>
</html>