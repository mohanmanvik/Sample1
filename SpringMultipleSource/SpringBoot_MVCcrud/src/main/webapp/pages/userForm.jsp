<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 
<form:form  action="addEmployee" modelAttribute="emp" method="post">

<table>
	 
	
	<tr>
		<td><form:label path="name">Customer Name</form:label></td>
		<td><form:input path="name" /></td> 
	</tr>
	
	
	 
	 
	 
	 <tr>
		<td colspan="2">
			<input type="submit" value="Add Customer"/>
		</td>
	</tr>
	 		 
			 
		 
	</table>
	 

</form:form>
</body>
</html>