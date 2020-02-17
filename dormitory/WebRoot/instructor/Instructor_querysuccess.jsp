<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>     
    <title>学生宿舍管理系统</title>   	
  </head>
  
  <body>
  <c:choose>
  	<c:when test="${empty list4}">
	 		<center><p>没有信息</p></center>
		 </c:when>
  	<c:otherwise>
    <table width="400">
    <c:forEach var="student" items="${list4}">
    	<tr>
    		<td>学号:</td>
    		<td>${student.stuID}</td>
    	</tr>
    	<tr>
    		<td>密码:</td>
    		<td>${student.password}</td>
    	</tr>
    	<tr>
    		<td>姓名:</td>
    		<td>${student.name}</td>
    	</tr>
    	<tr>
    		<td>性别:</td>
    		<td>${student.sex}</td>
    	</tr>
    	<tr>
    		<td>楼栋号:</td>
    		<td>${student.dormID}</td>
    	</tr>
    	<tr>
    		<td>房间号:</td>
    		<td>${student.roomID}</td>
    	</tr>
    	<tr>
    		<td>专业:</td>
    		<td>${student.major}</td>
    	</tr>
    	<tr>
    		<td>班级:</td>
    		<td>${student.classes}</td>
    	</tr>
    	<tr>
    		<td>电话:</td>
    		<td>${student.phone}</td>
    	</tr>
    	<tr>
    		<td>生日:</td>
    		<td>${student.birthday}</td>
    	</tr>
    	<tr>
    		<td>备注:</td>
    		<td>${student.remarks}</td>
    	</tr>
    </c:forEach>
    </table>
    </c:otherwise>
    </c:choose>
  </body>
</html>
