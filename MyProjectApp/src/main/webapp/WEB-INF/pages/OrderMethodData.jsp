<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h3>WELCOME TO ORDER METHOD DATA</h3>
	<c:choose>
		<c:when test="${! empty list }">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>MODE</th>
					<th>CODE</th>
					<th>TYPE</th>
					<th>ACCEPT</th>
					<th>NOTE</th>
					<th colspan="3">OPERATION</th>
				</tr>
				<!-- for(ShipmentType ob:list){} -->
				<c:forEach items="${list }" var="ob">
					<tr>
						<td>${ob.orderId}</td>
						<td>${ob.orderMode}</td>
						<td>${ob.orderCode}</td>
						<td>${ob.orderType}</td>
						<td>${ob.orderacpt}</td>
						<td>${ob.description}</td>
						<td>
						   <a href="delete?omid=${ob.orderId}">DELETE</a>
						</td>
						<td>
						   <a href="edit?omid=${ob.orderId}">EDIT</a>
						</td>
						<td>
						   <a href="view?omid=${ob.orderId}">VIEW</a>
						</td>
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


