<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registerResult0313.jsp' starting page</title>
    
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
    <br>用户账号：<s:property value="reg.unum"/>
    <br>用户姓名：<s:property value="reg.uname"/>
    <br>用户密码：<s:property value="reg.upwd"/>
    <br>用户电话：<s:property value="reg.telnum"/>
    <br>用户qq：<s:property value="reg.qq"/>
    <br>用户邮箱：<s:property value="reg.email"/>
  </body>
</html>
