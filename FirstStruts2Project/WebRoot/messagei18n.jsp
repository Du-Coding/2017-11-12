<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'messagei18n.jsp' starting page</title>
    
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
    <s:text name="hello"></s:text><br>
    <s:property value="%{getText('page.welcome')}"/><br>
    <s:text name="info.input">
    	<s:param>2</s:param>
    	<s:param>水子宝</s:param>
    </s:text><hr>
    <s:i18n name="message">
    	<s:text name="hello"></s:text><br>
    	<s:property value="%{getText('page.welcome')}"/><br>
    	<s:text name="info.input">
    		<s:param>2</s:param>
    		<s:param>水子宝</s:param>
    	</s:text><br>
    	<s:text name="page.sname"></s:text>
    	
    </s:i18n>
  </body>
</html>
