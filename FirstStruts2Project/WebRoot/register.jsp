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
			<s:textfield label="�û���*" name="uname"/>
			<s:password label="����*"  name="pwd"/>
			<s:password   label="�ظ�����*" name="repwd"/>
			<s:textfield label="email*" name="email"/>
			<s:textfield label="QQ��" name="qq"/>	
			<s:textfield label="�ֻ���" name="mobile"/>
		    <s:submit value="ע��"/>
			<s:reset  value="����"/>
		</s:form>

  </body>
</html>
