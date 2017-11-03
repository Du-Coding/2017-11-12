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
  	
    <br>用户名：<s:property value="uname"/>
    <br>密    码：<s:property value="upwd"/>
    <br>性别1：<s:property value="gender1"/>
    <br>性别2：<s:property value="gender2"/>
    <br>内容：<s:property value="content"/>
    <br>歌手1：<s:property value="star1"/>
    <br>歌手2：<s:property value="star2"/>
    <br>歌手3：<s:property value="star3"/>
    <br>国家天团：<s:property value="NB"/>
    <br>我喜欢：<s:property value="city1"/>
    <br>你爱来不来：<s:property value="city2"/>
  </body>
</html>
