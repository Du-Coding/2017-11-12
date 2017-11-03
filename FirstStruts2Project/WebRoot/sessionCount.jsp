<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sessionCount.jsp' starting page</title>
    
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
    这是你第<%= session.getAttribute("c") %>访问。<br>
    这是你第${sessionScope.c }访问<br>
    这是你第${c }访问<br>
  这是你第<%= session.getAttribute("cc") %>访问。<br>
    这是你第${sessionScope.cc }访问<br>
    这是你第${cc }访问<br>  
    <s:property value="#session.c"/>
    <s:property value="#session.cc"/>
  </body>
</html>
