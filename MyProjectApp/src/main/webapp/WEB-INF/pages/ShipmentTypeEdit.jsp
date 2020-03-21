<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<h3>WELCOME TO SHIPMENTTYPE EDIT PAGE</h3>
<form:form action="update" method="POST" modelAttribute="shipmentType">
<pre>
Shipment Id:
<form:input path="shipId" readonly="true"/>
Shipment Mode:
<select name="shipmode">
<option value="">-Select-</option>
<option value="Air">Air</option>
<option value="Truck">Truck</option>
<option value="Ship">Ship</option>
<option value="Train">Train</option>
</select>
Shipment Code:
<input type="text" name="shipcode" />
Enable Shipment:
<select name="enbShip">
<option value="">-Select-</option>
<option value="Yes">Yes</option>
<option value="No">No</option>
</select>
Shipment Grade:
<input type="radio" name=shipGrad value="A">A
<input type="radio" name="shipGrad" value="B">B
<input type="radio" name="shipGrad" value="C">C
Description:
<textarea name="shipDesc"></textarea>
<input type="submit" value="Update"/>
</pre>
</form:form>
</body>
</html>
