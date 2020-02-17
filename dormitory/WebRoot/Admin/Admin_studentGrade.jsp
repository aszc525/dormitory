<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>     
    <title>My JSP 'Student_quaryGrade.jsp' starting page</title> 
  </head>
  
  <body>
  <div>
  <div>
   <form action="/dormitory/Admin_queryGrade" method="post">
   	<table align="center">
   		<tr>
   			<td>
   				楼栋号：
   			</td>
   			<td>
   				<select name="dormID">
   					<option value="45">45</option>
   					<option value="46">46</option>
   					<option value="47">47</option>
   					<option value="48">48</option>
   					<option value="49">49</option>
   					<option value="50">50</option>
   					<option value="51">51</option>
   					<option value="52">52</option>
   					<option value="53">53</option>
   					<option value="54">54</option>
   					<option value="55">55</option>
   					<option value="56">56</option>
   					<option value="57">57</option>
   					<option value="58">58</option>
   					<option value="59" selected="selected">59</option>
   					<option value="60">60</option>
   				</select>
   			</td>
   			<td>
   				房间号：
   			</td>
   			<td>
   				<input type="text" name="roomID">
   			</td>
   			<td>
   				<input type="submit" value="检索">
   			</td>
   		</tr>
   	</table>
   </form>
</div>

<div>
<c:choose>
	 	<c:when test="${empty list9}">
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
	  <c:forEach var="grade" items="${list9}">
	  <tr>
	        <td align="center">${grade.dateID}</td>
		    <td align="center">${grade.time}</td>
		    <td align="center">${grade.dormID}</td>
		    <td align="center">${grade.roomID}</td>
		    <td align="center">${grade.points}</td>
		    <td align="center">${grade.score}</td> 
		    <td align="center">${grade.remarks}</td> 		        	    
	  </tr>
	  </c:forEach>
	</table>
	</center>
	</c:otherwise>
	</c:choose>
</div>
</div>
  </body>
</html>
