<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
	<h3>WELCOME TO ORDER METHOD REGISTER PAGE</h3>
	<form:form action="save" method="POST" modelAttribute="orderMethod">
		<pre>
Order Mode:
<form:radiobutton path="orderMode" value="sale" />sale
<form:radiobutton path="orderMode" value="purchase" />purchase
Order Code:
<form:input path="orderCode" />
Order Type:
<form:select path="orderType">
<form:option value="">-SELECT-</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select>
Order Accept:
<form:checkbox path="orderacpt" value="Multi-Model"/>MultiModel
<form:checkbox path="orderacpt" value="Accept Return"/>Accept Return
Description:
<form:textarea path="description" />
<input type="submit" value="create" />
</pre>
	</form:form>
	${message}

</body>
</html>