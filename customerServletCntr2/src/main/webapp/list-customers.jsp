<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="customerServletCntr.*" %>
 <%@ page import="java.util.List" %>
 <%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List customers</title>
<link type="text/css"
		  rel="stylesheet"
		  href="style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
		
			
			<input type="button" value="Adding customer"
				   onclick="window.location.href='Customer-form.jsp'; return false;"
				   class="add-button"
			/>
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				    <c:url var="updateUrl" value="updateCustomer.do">
					
					<c:param name="customerId" value="${tempCustomer.id}"/>
					</c:url>
					<c:url var="deleteUrl" value="deleteCustomer.do">
					</c:url>
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><a href="${updateUrl }">update</a></td><a href=${delteUrl}">Delete</td></a> 
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>


