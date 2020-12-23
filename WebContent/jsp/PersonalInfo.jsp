<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>  
.error{color:red}  
</style> 
<meta charset="ISO-8859-1">
<title>Personal info page</title>


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

	<form:form action="/PracticeWebAppwithHibernateannotations/personalinfo.do" modelAttribute="personalInfo"  style="margin: 0; text-align: center;" method="post">
	<h2>Personal info page</h2>

		<table style="width: 25%">
			<tr >
				<th >Firstname:</th>
				<td ><form:input type="text"  path="firstName"/></td>
				  <td><form:errors path="firstName" cssClass="error"/><br><br></td>
			</tr>
			<tr>
				<th>Lastname:</th>
				<td><form:input type="text"  path="lastName"/></td>
				 <td><form:errors path="lastName" cssClass="error"/><br><br></td>
			</tr>
			<tr>
				<th>Middlename:</th>
				<td><form:input type="text"  path="middleName"/></td>
				<td><form:errors path="middleName" cssClass="error"/><br><br></td>
			</tr>
			<tr>
				<th>Gender :</th>
				
				<td><form:radiobutton path="gender" value="male"/>Male
					<form:radiobutton  path="gender" value="female"/>Female</td>
					<td><form:errors path="gender" cssClass="error"/><br><br></td>
			</tr>
			<tr  >
			<th colspan="1">

				<td><input type="submit" name="submit" value="submit"></td>
				
			</tr>
		
		
	</table>
</form:form>


</body>
</html>