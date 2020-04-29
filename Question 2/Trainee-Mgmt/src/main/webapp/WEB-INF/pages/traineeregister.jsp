<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<form method="get" action="processregister" required>
<label>Trainee ID </label>
<div>
<input type="number" name="traineeid" required>
</div>

<label>Trainee Name</label>
<div>
<input type="text" name="traineename" required>
</div>

<label>Trainee Location</label>
<div>
<label>Chennai</label>
<input type="radio" id="indore" name="traineelocation"  value="indore">
<label>Banglore</label>
<input type="radio" id="bhopal" name="traineelocation"  value="bhopal">
<label>Mumbai</label>
<input type="radio" id="newyork" name="traineelocation"  value="newyork">
<label>Pune</label>
<input type="radio" id="paris" name="traineelocation"  value="paris">
</div>


<input type="submit" value="Register">

</form>
</body>
</html>
