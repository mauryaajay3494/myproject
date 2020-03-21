<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>

	<a href="excel">Excel Export</a>|
	<a href="pdf">PDF Export</a>

	<h3>WELCOME TO SHIPMENT TYPE DATA</h3>
	<c:choose>
		<c:when test="${! empty list }">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>CODE</th>
					<th>GRADE</th>
					<th>MODE</th>
					<th>ENABLE</th>
					<th>NOTE</th>
					<th colspan="2">OPERATION</th>
				</tr>
				<!-- for(OrdreMethod ob:list){} -->
				<c:forEach items="${list }" var="ob">
					<tr>
						<td>${ob.shipId}</td>
						<td>${ob.shipmode}</td>
						<td>${ob.shipcode}</td>
						<td>${ob.enbShip}</td>
						<td>${ob.shipGrad}</td>
						<td>${ob.shipDesc}</td>
						<td><a href="delete?sid=${ob.shipId}">DELETE</a></td>
						<td><a href="edit?sid=${ob.shipId}">EDIT</a></td>
						<td><a href="view?sid=${ob.shipId}">VIEW</a></td>
					</tr>
				</c:forEach>
			</table>
			${message }
		</c:when>
		<c:otherwise>
			<H4>NO DATA FOUND!!</H4>
		</c:otherwise>
	</c:choose>
</body>
</html>



