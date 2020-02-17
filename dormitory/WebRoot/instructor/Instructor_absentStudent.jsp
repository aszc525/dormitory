<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>     
    <title>学生宿舍管理系统</title>   	
  </head>
  
  <body>
  <c:choose>
  	<c:when test="${empty list6}">
	 		<center><p>没有信息</p></center>
		 </c:when>
  	<c:otherwise>
    <table border="1" width="80%" align="center">
    	<tr>
    	<td>缺勤编号:</td>
    	<td>学号:</td>
    	<td>姓名:</td>
    	<td>楼栋号:</td>
    	<td>房间号:</td>
    	<td>缺勤时间:</td>
    	<td>电话号码:</td>
    	<td>备注:</td>
    	</tr>
    <c:forEach var="absent" items="${list6}">
    	<tr>
    		<td>${absent.absentID}</td>    	    		
    		<td>${absent.stuID}</td>  	   		
    		<td>${absent.name}</td>   		
    		<td>${absent.dormID}</td>   	   		
    		<td>${absent.roomID}</td>   	
    		<td>${absent.time}</td>   	
    		<td>${absent.phone}</td>
    		<td>${absent.remarks}</td>
    	</tr>   	
    </c:forEach>
    </table>
    </c:otherwise>
    </c:choose>
  </body>
</html>
