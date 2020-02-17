<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>     
    <title>学生宿舍管理系统</title>   	
  </head>
  
  <body>
  <c:choose>
  	<c:when test="${empty list11}">
	 		<center><p>没有信息</p></center>
		 </c:when>
  	<c:otherwise>
    <table width="400">
    <c:forEach var="admin" items="${list11}">
    	<tr>
    		<td>宿舍管理员ID:</td>
    		<td>${admin.adminID}</td>
    	</tr>
    	<tr>
    		<td>楼栋号:</td>
    		<td>${admin.dormID}</td>
    	</tr>
    	<tr>
    		<td>密码:</td>
    		<td>${admin.password}</td>
    	</tr>
    	<tr>
    		<td>姓名:</td>
    		<td>${admin.name}</td>
    	</tr>
    	<tr>
    		<td>性别:</td>
    		<td>${admin.sex}</td>
    	</tr>
    	<tr>
    		<td>电话号码:</td>
    		<td>${admin.phone}</td>
    	</tr>
    	<tr>
    		<td>备注:</td>
    		<td>${admin.remarks}</td>
    	</tr>
    	
    </c:forEach>
    </table>
    </c:otherwise>
    </c:choose>
  </body>
</html>
