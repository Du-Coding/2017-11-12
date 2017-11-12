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
    
    <title>My JSP 'index.jsp' starting page</title>
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
  	<h1>用户登录</h1>
    <s:form action="Users_login" method="post" id="myform">
    	<s:textfield label="用户名" name="u.uname" id="uname"/>
    	<s:textfield label="密码" name="u.upwd" id="upwd"/>
    	<s:submit value="登录"/>
    	<s:reset value="重置"/>
    </s:form>
  </body>
</html>
