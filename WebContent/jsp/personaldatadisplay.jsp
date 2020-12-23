<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.as.vo.PersonalInfo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h2>Registration compleed successfully</h2>

	<table border=1>
				<tr>
					
					<th>First Name</th>
					<th>Last Name</th>
					<th>Middle Name</th>
				
					<th>Address</th>
					<th>city</th>
					<th>state</th>
					<th> phone </th>
					<th>Bank name</th>
					<th>Account no</th>
					<th>SSN</th>
				</tr>
<%-- 
				<%
					PersonalInfo pi =  (PersonalInfo)session.getAttribute("pi");

				
				%> --%>
<jsp:useBean id="personalInfo" class="com.as.vo.PersonalInfo" scope="session" >
</jsp:useBean>
<jsp:useBean id="contactInfo" class="com.as.vo.ContactInfo" scope="session" >
</jsp:useBean>
<jsp:useBean id="bankInfo" class="com.as.vo.BankInfo" scope="session" >
</jsp:useBean>
				<tr>
					<td><%=personalInfo.getFirstName()%><br></td>
					<td><%=personalInfo.getLastName()%><br></td>
					<td><%=personalInfo.getMiddleName()%><br></td>
					
					<td><%=contactInfo.getAddress()%><br></td>
					<td><%=contactInfo.getCity()%><br></td>
					<td><%=contactInfo.getState()%><br></td>
					<td><%=contactInfo.getPhone()%><br></td>
					<td><%=bankInfo.getbName()%><br></td>
					<td><%=bankInfo.getAccountNo()%><br></td>
					<td><%=bankInfo.getSsn()%><br></td>
				</tr>
<%-- 
				<%
					}
				%> --%>
			</table>

</body>
</html>