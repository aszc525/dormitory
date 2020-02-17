<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>     
    <title>学生宿舍管理系统</title>   	
  </head>
  
  <body>
  <c:choose>
  	<c:when test="${empty list7}">
	 		<center><p>没有信息</p></center>
		 </c:when>
  	<c:otherwise>
    <table width="400">
    <c:forEach var="instructor" items="${list7}">
    	<tr>
    		<td>辅导员编号:</td>
    		<td>${instructor.instructorID}</td>
    	</tr>
    	<tr>
    		<td>姓名:</td>
    		<td>${instructor.name}</td>
    	</tr>
    	<tr>
    		<td>性别:</td>
    		<td>${instructor.sex}</td>
    	</tr>
    	<tr>
    		<td>电话号码:</td>
    		<td>${instructor.phone}</td>
    	</tr>
    	<tr>
    		<td>备注:</td>
    		<td>${instructor.remarks}</td>
    	</tr>
    	
    </c:forEach>
    </table>
    </c:otherwise>
    </c:choose>
  </body>
</html>
