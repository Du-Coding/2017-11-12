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
    <br>��    �룺<s:property value="upwd"/>
    <br>�Ա�1��<s:property value="gender1"/>
    <br>�Ա�2��<s:property value="gender2"/>
    <br>���ݣ�<s:property value="content"/>
    <br>����1��<s:property value="star1"/>
    <br>����2��<s:property value="star2"/>
    <br>����3��<s:property value="star3"/>
    <br>�������ţ�<s:property value="NB"/>
    <br>��ϲ����<s:property value="city1"/>
    <br>�㰮��������<s:property value="city2"/>
  </body>
</html>
