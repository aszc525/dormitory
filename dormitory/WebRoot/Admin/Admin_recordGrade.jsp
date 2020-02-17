<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Admin_recordGrade.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="Admin_recordGrade" method="post">
    	<table border="1" width="80%" align="center">
    		<tr>
    			<td>
    				打分编号：
    			</td>
    			<td>
    				<input type="text" name="dateID">
    			</td>
    			<td>
    				打分时间：
    			</td>
    			<td>
    				<input type="text" name="time">
    			</td>
    		<tr>
    		<tr>
    			<td>
    				楼栋号：
    			</td>
    			<td>
    				<input type="text" name="dormID">
    			</td>
    			<td>
    				房间号：
    			</td>
    			<td>
    				<input type="text" name="roomID">
    			</td>
    		<tr>
    		<tr>
    			<td>
    				扣分原因：
    			</td>
    			<td>
    				<textarea name="points" rows="6" cols="66"></textarea>
    			</td>
    			<td>
    				分数：
    			</td>
    			<td>
    				<input type="text" name="score">
    			</td>
    		<tr>
    		<tr>
  				<td align="center">
  					<input type="submit" value="提交">
  				</td>
  				<td align="center">
  					<input type="reset" value="重置">
  				</td>
  			</tr>
    	</table>    
    </form>
  </body>
</html>
