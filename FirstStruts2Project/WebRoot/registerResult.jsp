<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%@ taglib  prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TagFormResult.jsp' starting page</title>
    
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
  	
    <br>�û�����<s:property value="uname"/>
    <br>��    �룺<s:property value="pwd"/>
    <br>�ظ����룺<s:property value="repwd"/>
    <br>���䣺<s:property value="email"/>
    <br>qq��<s:property value="qq"/>
    <br>�绰��<s:property value="mobile"/>
    
  </body>
</html>