<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>Untitled Page</TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<STYLE type=text/css> 
table.gridtable {
     font-family: verdana,arial,sans-serif;
     font-size:11px;
     color:#333333;
     border-width: 1px;
     border-color: #666666;
     border-collapse: collapse;
 }
 table.gridtable th {
    border-width: 1px;
     padding: 8px;
     border-style: solid;
     border-color: #666666;
     background-color: #dedede;
 }
 table.gridtable td {
     border-width: 1px;
     padding: 8px;
     border-style: solid;
     border-color: #666666;
     background-color: #ffffff;
 }



{
	FONT-SIZE: 12px
}
.gridView {
	BORDER-RIGHT: #bad6ec 1px; BORDER-TOP: #bad6ec 1px; BORDER-LEFT: #bad6ec 1px; COLOR: #566984; BORDER-BOTTOM: #bad6ec 1px; FONT-FAMILY: Courier New
}
.gridViewHeader {
	BORDER-RIGHT: #bad6ec 1px solid; BORDER-TOP: #bad6ec 1px solid; BACKGROUND-IMAGE: url(${pageContext.request.contextPath }/images/bg_th.gif); BORDER-LEFT: #bad6ec 1px solid; LINE-HEIGHT: 27px; BORDER-BOTTOM: #bad6ec 1px solid
}
.gridViewItem {
	BORDER-RIGHT: #bad6ec 1px solid; BORDER-TOP: #bad6ec 1px solid; BORDER-LEFT: #bad6ec 1px solid; LINE-HEIGHT: 32px; BORDER-BOTTOM: #bad6ec 1px solid; TEXT-ALIGN: center
}
.cmdField {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BACKGROUND-IMAGE: url(${pageContext.request.contextPath }/images/bg_rectbtn.png); OVERFLOW: hidden; BORDER-LEFT: 0px; WIDTH: 67px; COLOR: #364c6d; LINE-HEIGHT: 27px; BORDER-BOTTOM: 0px; BACKGROUND-REPEAT: repeat-x; HEIGHT: 27px; BACKGROUND-COLOR: transparent; TEXT-DECORATION: none
}
.buttonBlue {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BACKGROUND-IMAGE: url(${pageContext.request.contextPath }/images/bg_button_blue.gif); BORDER-LEFT: 0px; WIDTH: 78px; COLOR: white; BORDER-BOTTOM: 0px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 21px
}
</STYLE>
<META content="MSHTML 6.00.2900.5848" name=GENERATOR>
<%
String path =request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

</HEAD>
<BODY 
style="BACKGROUND-POSITION-Y: -120px; BACKGROUND-IMAGE: url(<%=basePath %>/images/bg.gif); BACKGROUND-REPEAT: repeat-x">
<SCRIPT type=text/javascript>
//<![CDATA[
var theForm = document.forms['aspnetForm'];
if (!theForm) {
    theForm = document.aspnetForm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
</SCRIPT>
<SCRIPT src="EmployeeMgr.files/WebResource.axd" type=text/javascript></SCRIPT>
<SCRIPT src="EmployeeMgr.files/ScriptResource.axd" 
type=text/javascript></SCRIPT>
<SCRIPT 
src="C:\Documents and Settings\Administrator\桌面\MyOffice 首页.files\EmployeeMgr.files\ScriptResource(1).axd" 
type=text/javascript></SCRIPT>
<DIV>
  <TABLE height="100%" class="table" cellSpacing=0 cellPadding=0 width="100%" border=0>
    <TBODY>
      <TR 
  style="BACKGROUND-IMAGE: url(<%=basePath %>/images/bg_header.gif); BACKGROUND-REPEAT: repeat-x" 
  height="47px">
        <TD width="10px"  ><SPAN 
      style="FLOAT: left; BACKGROUND-IMAGE: url(<%=basePath %>/images/main_hl.gif); WIDTH: 15px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px"></SPAN></TD>
        <TD>
 <SPAN style="FLOAT: left; BACKGROUND-IMAGE: url(<%=basePath %>/images/main_hl2.gif); WIDTH: 15px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px"></SPAN><SPAN 
      style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; FLOAT: left; BACKGROUND-IMAGE: url(<%=basePath %>/images/main_hb.gif); 
      PADDING-BOTTOM: 10px; COLOR: white; PADDING-TOP: 10px; BACKGROUND-REPEAT: repeat-x;  TEXT-ALIGN: center; 0px: ">信息浏览</SPAN><SPAN 
      style="FLOAT: left; BACKGROUND-IMAGE: url(<%=basePath %>/images/main_hr.gif); WIDTH: 60px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px"></SPAN></TD>
      
      <TD 
    style="BACKGROUND-POSITION: BACKGROUND-IMAGE: url(<%=basePath %>/images/main_rc.gif)" 
    width="10px" height="47px">
    
    </TD>
      </TR>
      <TR>
        <TD style="BACKGROUND-IMAGE: url(<%=basePath %>/images/main_ls.gif);width: 15px"></TD>
        <TD 
    style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; COLOR: #566984; PADDING-TOP: 10px; BACKGROUND-COLOR: white" 
    vAlign=top align="middle">
<div>
 <div>
   <form action="/dormitory/Student_queryGrade" method="post">
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
	 	<c:when test="${empty list1}">
	 		<center><p>没有信息</p></center>
		 </c:when>
	 <c:otherwise>
	 <center>
    <table border="1" class="gridtable">
	  <tr>
	  	    <td align="center">打分编号</td>
	    	<td align="center">打分时间</td>
	    	<td align="center">楼栋号</td>    
	    	<td align="center">房间号</td>
	    	<td align="center">扣分原因</td>
	    	<td align="center">寝室分数</td>
	    	<td align="center">备注</td>
	  </tr>
	  <c:forEach var="grade" items="${list1}">
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
        </TD>
        <TD style="BACKGROUND-IMAGE: url(<%=basePath %>/images/main_rs.gif);width: 15px"></TD>
      </TR>
      <TR 
  style="BACKGROUND-IMAGE: url(<%=basePath %>/images/main_fs.gif); BACKGROUND-REPEAT: repeat-x" 
  height=10>
        <TD style="BACKGROUND-IMAGE: url(<%=basePath %>/images/main_lf.gif)"><span ></span></TD>
        <TD style="BACKGROUND-IMAGE: url(<%=basePath %>/images/main_fs.gif)"></TD>
        <TD 
style="BACKGROUND-IMAGE: url(<%=basePath %>/images/main_rf.gif)"></TD>
      </TR>
    </TBODY>
  </TABLE>
</DIV>
<SCRIPT type=text/javascript>
//<![CDATA[
Sys.Application.initialize();
//]]>
</SCRIPT>
</BODY>
</HTML>
