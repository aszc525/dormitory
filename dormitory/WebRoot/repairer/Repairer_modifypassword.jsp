<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>学生宿舍管理系统</title>
  </head>
  
  <body>
  	<form action="../Repairer_modifypassword" method="post">
    <table border="1" width="80%" align="center" >
    	<tr>
    		<td>
    			新&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码：
    		</td>
    		<td>
    			<input type="password" name="password">
    		</td>
    	</tr>
    	<tr>
    		<td>
    			确认新密码：
    		</td>
    		<td>
    			<input type="password" name="passwordAgain">
     		</td>
    	</tr>
    	<tr>
    		<td>
    			<input type="submit" value="确定">
    		</td>
    		<td>
    			<input type="reset" value="重置">
     		</td>
    	</tr>   	
    </table>
    </form>
  </body>
</html>
