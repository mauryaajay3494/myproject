<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome to ShipmentType Register Page</h3>
	<form action="save" method="post">
		<pre>
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

 <input type="Submit" value="CREATE SHIPMENT" />
</pre>
	</form>
	${message }
	

</body>
</html>