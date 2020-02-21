<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body style="background-color: lavender">
<center>
<h1>Discount Price Calculation</h1>
<a href="?language=en">English</a>
<a href="?language=gm">German</a>
<a href="?language=fr">French</a>
<form:form action="result" method="GET" modelAttribute="discount">


<spring:message code="label.productPrice"/><form:input path="productPrice" type="text" id="productPrice" name="productPrice" /><form:errors path="productPrice" />
		<br>
<spring:message code="label.productType"/><form:select path="productType" items="${productList}" name="productType" id="productType"/>
		<br>
<input type="submit" value="Calculate" name="submit" id="submit" />
<input type="reset" value="Clear" name="Clear" id="Clear" />
</form:form>
</center>
</body>
</html>
