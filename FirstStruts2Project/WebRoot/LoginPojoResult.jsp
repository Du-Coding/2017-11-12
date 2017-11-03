<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'LoginResult.jsp' starting page</title>
    
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
    登陆成功<br>
    	<%=session.getAttribute("uname") %>登录，密码<%= session.getAttribute("upwd") %><br>
    	${sessionScope.upwd },${sessionScope.uname }<br>
    	${lg.uname },${lg.upwd }<br>
    	<hr>
    	ValueStack的值：
    	<s:property value="lg.uname"/>
    	&nbsp;&nbsp;&nbsp;
    	<s:property value="lg.upwd"/><br>
    	StackContext的值（ActionContext）：
    	<s:property value="#session.uname"/>
    	&nbsp;&nbsp;&nbsp;
    	<s:property value="#session.upwd"/><br>
    	<s:property value="#application.color"/>
    	
    	
    <s:debug/>
  </body>
</html>
