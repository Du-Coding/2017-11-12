<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
  	<s:form action="register"  method="post">
			<s:textfield label="ÓÃ»§Ãû*" name="uname"/>
			<s:password label="ÃÜÂë*"  name="pwd"/>
			<s:password   label="ÖØ¸´ÃÜÂë*" name="repwd"/>
			<s:textfield label="email*" name="email"/>
			<s:textfield label="QQºÅ" name="qq"/>	
			<s:textfield label="ÊÖ»úºÅ" name="mobile"/>
		    <s:submit value="×¢²á"/>
			<s:reset  value="ÖØÖÃ"/>
		</s:form>

  </body>
</html>
