<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add money</title>
</head>
<body bgcolor="silver">

<form:form method="post" action="save">    
        <table >  
          <tr>    
          <td>Mobile : </td>   
          <td><form:input type="text" maxlength="10" title="Please enter 10 digits" path="mob_no"/></td>  
         </tr>    
         <tr>    
          <td>Amount :</td>    
          <td><form:input type="int" path="amount" /></td>  
         </tr> 
        <tr>
        	<td>Comment:</td>
         	<td><form:input type="text" path="comment1"/></td>
         </tr>  
         <tr>   
          <td><input type="submit" value="submit" /></td>  
         </tr>  
         
         
         </table>
 </form:form>  

</body>

</html>