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
    
    <title><s:text name="page.login.title"/></title>
    
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
  	<h1><s:text name="page.login.welcome"/></h1>
  	<s:fielderror />
    <s:form action="logini18n" method="post">
    	<s:textfield label="%{getText('page.login.uname')}" name="uname" />
    	<s:password key="page.login.pwd" name="pwd"/>
    	<s:submit key="page.login.button" name="submit"/>
    </s:form>
  </body>
</html>
