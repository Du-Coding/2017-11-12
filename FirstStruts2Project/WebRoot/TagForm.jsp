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
    
    <title>My JSP 'TagForm.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
  	    function validate(){
  	    	//用户名认证
  	    	var name = document.myform.uname.value;
  	    
  	    	
  	    	var exp = new RegExp(/^[a-zA-Z][a-zA-Z0-9_]{2,9}$/);
  	    	if(!exp.test(name)){
  	    		alert("用户名格式错误！");
  	    		document.myform.uname.focus();
  	    		return false;//防止向下执行
  	    	}
  	    	
  	    	//密码验证
  	    	var pwd = document.myform.upwd.value;
  	    	var exp2 =new RegExp(/^[0-9]{5,}$/); 
  	    	if(!exp2.test(pwd)){
  	    		alert("密码格式错误！");
  	    		document.myform.upwd.focus();
  	    		return false;//防止向下执行
  	    	}
  	    	
  	    }
    </script>

  </head>
  
  <body>
    <h1>表单标记的用法</h1>
    <s:fielderror/>
    <s:form action="tagform" method="post" id="myform" name="myform" onsubmit="return validate()">
    	<s:textfield label="用户名" name="uname" id="uname"></s:textfield>
    	<s:password label="密码" name="upwd" id="upwd"></s:password>
    	<s:textarea label="内容" name="content" ></s:textarea>
    	<s:radio label="性别" name="gender1" list="{'男','女'}" value="'男'"></s:radio>
    	<s:radio label="性别" name="gender2" list="#{1:'男',2:'女'}" value="1"></s:radio>
    	<s:checkbox label="陈奕迅" fieldValue="陈奕迅" name="star1"></s:checkbox>
    	<s:checkbox label="张学友" fieldValue="张学友" name="star1"></s:checkbox>
    	<s:checkbox label="周杰伦" fieldValue="周杰伦" name="star1"></s:checkbox>
    	<s:checkboxlist label="歌手" list="{'张学友','陈奕迅','周杰伦'}" name="star2" value="'张学友'"></s:checkboxlist>
    	<s:checkboxlist label="歌手" list="#{'谭咏麟':'谭咏麟','梅艳芳':'梅艳芳','张国荣':'张国荣'}" name="star3" value="'谭咏麟'"></s:checkboxlist>
    	<s:set var="like" value="#{'外交部':'外交部','国防部':'国防部','公安部':'公安部' }"></s:set>
    	<s:checkboxlist label="国家天团" list="like" name="NB" value="外交部"></s:checkboxlist>
    	<s:select list="{'金沙','岩孔','沿厂'}" label="我喜欢就好" name="city1"></s:select>
    	<s:select list="#{'北京':'北京','上海':'上海','广州':'广州' }" label="你爱来不来" name="city2" multiple="true"></s:select>
    	<s:submit name="ok" value="提交" ></s:submit>
    	<s:reset name="reset" value="重置"></s:reset>
    </s:form>
  </body>
</html>
