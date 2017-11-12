<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryAllUsers.jsp' starting page</title>
    
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
    <h1>显示用户信息</h1>
    <table border="1">
    	<tr>
    		<th>用户名</th>
    		<th>密码</th>
    	</tr>
    	<s:iterator var = "user" value = "#session.users">
    		<tr>
    			<td>
    				<s:property value = "#user.uname"/>
    			</td>
    			<td>
    				<s:property value = "#user.upwd"/>
    			</td>
    		</tr>
    	</s:iterator>
    </table>
    <a href="login.jsp">返回登录界面</a>
  </body>
</html>
