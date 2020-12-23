<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>  
.error{color:red}  
</style> 
<meta charset="ISO-8859-1">
<title>Contact info page</title>

	<style>
form {
	border: 1px solid black;
	 border-collapse: collapse; 
	 max-width:35%;
}

th, td {
	padding: 4px;
	text-align: left;
	
}

</style>
</head>
<body>

	<form:form  modelAttribute="contactInfo"  action="/PracticeWebAppwithHibernateannotations/contactinfo.do"  style="margin: 0; text-align: center;" method="post">
	<h2>Contact info page</h2>
	
	
		<table style="width: 25%">
			<tr >
				<th >Address:</th>
				<td ><form:input type="text"  path="address"/></td>
				  <td><form:errors path="address" cssClass="error"/><br><br></td>
			</tr>
			<tr>
				<th>City:</th>
				<td><form:input type="text"  path="city"/></td>
				  <td><form:errors path="city" cssClass="error"/></td>
				    
			</tr>
			<tr>
				<th>State:</th>
				<td><form:input type="text"  path="state"/></td>
				  <td><form:errors path="state" cssClass="error"/></td>
			</tr>
			<tr>
				<th>Country :</th>
				<td><form:input type="text" path="country" /></td>
				  <td><form:errors path="country" cssClass="error"/></td>
			</tr>
			<tr>
				<th>Phone :</th>
				<td><form:input type="text" path="phone"/></td>
				  <td><form:errors path="phone" cssClass="error"/></td>
			</tr>
					
			<tr  >
			<th colspan="1">

				<td><input type="submit" name="submit" value="submit"></td>
				
			</tr>
		</table>
		
	
</form:form>


</body>
</html>