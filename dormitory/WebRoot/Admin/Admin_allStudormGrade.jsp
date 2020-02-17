<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body background=image/1.jpg><font size=2>
 	<p><p>
  	 <c:choose>
	 	<c:when test="${empty list10}">
	 		<center><p>没有信息</p></center>
		 </c:when>
	 <c:otherwise>
	 <center>
    <table border="1" >
	  <tr>
	  	    <td align="center">打分编号</td>
	    	<td align="center">打分时间</td>
	    	<td align="center">楼栋号</td>    
	    	<td align="center">房间号</td>
	    	<td align="center">扣分原因</td>
	    	<td align="center">寝室分数</td>
	    	<td align="center">备注</td>
	  </tr>
	  <c:forEach var="grade" items="${list10}">
	  <tr>
	        <td align="center">${grade.dateID}</td>
		    <td align="center">${grade.time}</td>
		    <td align="center">${grade.dormID}</td>
		    <td align="center">${grade.roomID}</td>
		    <td align="center">${grade.points}</td>
		    <td align="center">${grade.score}</td> 
		    <td align="center">${grade.remarks}</td> 		        	    
	  </tr>    	    	    
	    
	    <%-- 
	     <td align="center">
	    	<form action="deleteServlet?goods.gid=${goods.gid}" method="post">
		 		 <input type ='hidden' name='delete' value= " ">
                 <input type ='submit'  value='删除' >
		 	</form>
		 </td>
		 <td align="center">
		    <form action="modify.jsp?goods.gid=${goods.gid}&goods.gname=${goods.gname}&goods.gprice=${goods.gprice}&goods.gamount=${goods.gamount}&goods.producer=${goods.producer}&goods.remarks=${goods.remarks}" method="post">
		 		 <input type ='hidden' name='update' value= " ">
                 <input type ='submit'  value='修改' >
		 	</form>	
		 </td>
		 --%>
	 
	  </c:forEach>
	</table>
	</center>
	</c:otherwise>
	</c:choose>
  </body>
</html>
		