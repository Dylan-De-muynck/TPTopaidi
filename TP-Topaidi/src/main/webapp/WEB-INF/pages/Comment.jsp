<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<%@ include file="commons/menu.jsp" %>
 	
 	<h2>Liste idées </h2>

<table>
    <thead>
        <tr>
            <th>Nom</th>
            <th>Commentaire</th>
        </tr>
    </thead>



	<tbody>
		<c:forEach items="${Comments}" var="Comment">
		<tr>
			<td>
			<c:out value="${Comment.utilisateur.nom}"/>
			</td>
			<td>
			<c:out value="${Comment.commentaire}"/>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
 	
 	
</div>

</body>
</html>