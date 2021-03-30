<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.hello.pojo.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
td, th {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<center>
<h1>Welcome to employee Dashboard</h1>
<h1 style="text-align: right;color: green;">Welcome:${name}</h1>
</br>
<table>
  <tr>
    <th> ID</th>
    <th> First Name</th>
    <th> Last Name</th>
    <th> Email ID</th>
    <th> Salary</th>
  </tr>
  <c:forEach items="${employee}" var="employee">
  <tr>
    <td>${employee.employeeID}</td>
    <td>${employee.employeeFirstName}</td>
    <td>${employee.employeeLastName}</td>
    <td>${employee.employeeEmailID}</td>
    <td>${employee.employeeSalary}</td>
  </tr>
 </c:forEach>
 </table>
 </center>
</body>
</html>
