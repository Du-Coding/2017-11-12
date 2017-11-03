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
    ${uname }登录，密码${upwd }
    <br>
    <hr>
    <!-- 
    	uname、upwd存在于ValueStack中，可以直接访问
     -->
    <s:property value="uname"/><br>
    <s:property value="upwd"/><br>
    <s:property value="execute()"/><br>
    <s:property value="Hello()"/><br>
    <s:property value="uname.length()"/>
    <s:debug/>
  </body>
</html>
