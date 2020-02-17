<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>   
    <title>学生宿舍管理系统</title>   	
  </head>
   <body>
   		<c:choose>
	 	<c:when test="${empty list12}">
	 		<center><p>没有信息</p></center>
		 </c:when>
	 <c:otherwise>
	 <center>
    <table border="1" >
	  <tr>
	  	    <th width="100">维修编号  </th>
		    <th width="100">申报人名字  </th>
		    <th width="100">申报人电话</th>
		    <th width="100">保修时间</th>
			<th width="100">楼栋号</th>
		    <th width="100" >房间号</th>
		    <th width="100" >故障描述</th>
		    <th width="100" >备注</th>
	  </tr>
	  <c:forEach var="repair" items="${list12}">
	  <tr>
	        <td align="center" align="center">${repair.repairID}</td>
		    <td align="center" align="center">${repair.name}</td>
		    <td align="center" align="center">${repair.phone}</td>
		    <td align="center" align="center">${repair.times}</td>
		    <td align="center" align="center">${repair.dormID}</td>
		    <td align="center" align="center">${repair.roomID}</td> 
		    <td align="center" align="center">${repair.GZmiaoshu}</td>
		    <td align="center" align="center">${repair.remarks}</td>   	    	    
	  </tr>
	  </c:forEach>
	</table>
	</center>
	</c:otherwise>
	</c:choose>       
  </body>
</html>
