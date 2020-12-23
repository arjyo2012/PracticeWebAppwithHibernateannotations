<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>  
.error{color:red}  
</style> 
<meta charset="ISO-8859-1">
<title>Bank info page</title>

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

	<form:form  modelAttribute="bankInfo"  action="/PracticeWebAppwithHibernateannotations/bankinfo.do"  style="margin: 0; text-align: center;" method="post">
	<h2>Bank info page</h2>
	
		<table style="width: 25%">
			<tr >
				<th >Bank Name:</th>
				<td ><form:input type="text" id="bname" path="bName"/></td>
				  <td><form:errors path="bName" cssClass="error"/><br><br></td>
			</tr>
			<tr>
				<th>Account# :</th>
				<td><form:input type="text" id="accountno" path="accountNo"/></td>
				  <td><form:errors path="accountNo" cssClass="error"/><br><br></td>
			</tr>
			<tr>
				<th>SSN#:</th>
				<td><form:input type="text" id="ssn" path="ssn"/></td>
				  <td><form:errors path="ssn" cssClass="error"/><br><br></td>
			</tr>
			
			<tr  >
			<th colspan="1">

				<td align="center"><input type="submit" name="submit" value="submit"></td>
				
			</tr>
		
		</table>
	
</form:form>


</body>
</html>