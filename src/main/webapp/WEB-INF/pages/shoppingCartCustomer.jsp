<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Choose Injected Customer</title>
 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">
 
</head>
<body>
<jsp:include page="_header.jsp" />
<jsp:include page="_menu.jsp" />
 
<div class="page-title">Choose Injected Customer</div>
 
   <form:form method="POST" modelAttribute="customerForm"
       action="${pageContext.request.contextPath}/shoppingCartCustomer">
       
		<table border="1" style="width:100%">
	       <tr>
	           <th>Customer Id</th>
	           <th>Customer Name</th>
	           <th>Customer Address</th>
	           <th>Customer Email</th>
	           <th>Customer Phone</th>
	           <th>Customer Type</th>
	           <th>Join Date</th>
	       </tr>
	       <c:forEach items="${custInfoList}" var="custInfo">
	           <tr>
	               <td>${custInfo.customerId}</td>
	               <td>${custInfo.customerName}</td>
	               <td>${custInfo.customerAddress}</td>
	               <td>${custInfo.customerEmail}</td>
	               <td>${custInfo.customerPhone}</td>
	               <td>${custInfo.customerType}</td>
	               <td>${custInfo.joinDate}</td>
	           </tr>
	       </c:forEach>
		</table>
		<hr/>
		<table>
           <tr>
               <td>Customer ID *</td>
               <td><form:input path="customerId" /></td>
               <td><form:errors path="customerId" class="error-message" /></td>
           </tr>
 
           <%-- <tr>
               <td>Email *</td>
               <td><form:input path="email" /></td>
               <td><form:errors path="email" class="error-message" /></td>
           </tr>
 
           <tr>
               <td>Phone *</td>
               <td><form:input path="phone" /></td>
               <td><form:errors path="phone" class="error-message" /></td>
           </tr>
 
           <tr>
               <td>Address *</td>
               <td><form:input path="address" /></td>
               <td><form:errors path="address" class="error-message" /></td>
           </tr> --%>
 
           <tr>
               <td>&nbsp;</td>
               <td><input type="submit" value="Submit" /> <input type="reset"
                   value="Reset" /></td>
           </tr>
       </table>
 
   </form:form>
 
 
   <jsp:include page="_footer.jsp" />
 
 
</body>
</html>
