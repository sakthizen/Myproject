<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>
Flight Number:${flight.flightNumber}</br>
operating Airlines:${flight.operatingAirlines}</br>
Departure City:${flight.departureCity}</br>
Arrival City:${flight.arrivalCity}</br>
Departure Date:${flight.dateofDeparture}</br>
<h2>Enter Passenger Details</h2>
<form action="completeReservation"method="post">
<pre>
first name<input type="text"name="firstName"/>
last name<input type="text"name="lastName"/>
middle name<input type="text"name="middleName"/>
email<input type="text"name="email"/>
phone<input type="text"name="phone"/>
<input type="hidden"name="flightId"value="${flight.id}"/>
<h2>Enter the payment details</h2>
Name on The Card<input type="text"name="nameofThecard"/>
Card Number<input type="text"name="cardNumber"/>
cvv<input type="text"name="cvv"/>
Expiry Date<input type="text"name="expirydate"/>
<input type="submit"value="complete reservation"/>
</pre>
</form>
</body>
</html>
