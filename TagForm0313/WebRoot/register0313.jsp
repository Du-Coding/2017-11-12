<%@ page language="java" import="java.util.*" pageEncoding="gb18030"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function test(){
			var unum = document.myform.unum.value;
			var exp1 = new RegExp(/^[a-zA-Z][a-zA-Z0-9_]{2,9}$/);
			if(!exp1.test(unum)){
				alert("账号格式错误");
				document.myform.unum.focus();
				return false;
			}
			var uname = document.myform.uname.value;
			var exp2 = new RegExp(/^\W{2,}$/);
			if(!exp2.test(uname)){
				alert("名字格式错误");
				document.myform.uname.focus();
				return false;
			}
			var upwd = document.myform.upwd.value;
			var exp3 = new RegExp(/^\d{5,}$/);
			if(!exp3.test(upwd)){
				alert("密码格式错误");
				document.myform.upwd.focus();
				return false;
			}
			var repwd = document.myform.repwd.value;
			if(repwd!=upwd){
				alert("请输入相同的密码");
				document.myform.repwd.focus();
				return false;
			}
			var telnum = document.myform.telnum.value;
			var exp4 = new RegExp(/^\d{11}$/);
			if(!exp4.test(telnum)){
				alert("请输入正确的11位号码");
				document.myform.telnum.focus();
				return false;
			}
			var qq = document.myform.qq.value;
			var exp5 = new RegExp(/^\d{5,10}$/);
			if(!exp5.test(qq)){
				alert("qq格式错误，5-10位数字");
				document.myform.qq.focus();
				return false;
			}
			
			var email = document.myform.email.value;
			var exp6 = RegExp(/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/);
			if(!exp6.test(email)){
				alert("邮箱格式错误");
				document.myform.email.focus();
				return false;
			}
		}
	</script>
  </head>
  
  <body>
    <s:form action="register" method="post" name="myform" id="myform" onsubmit="return test()">
    	<s:textfield label="会员账号" name="reg.unum" id="unum"></s:textfield>
    	<s:textfield label="真实姓名" name="reg.uname" id="uname"></s:textfield>
    	<s:password label="登录密码" name="reg.upwd" id="upwd"></s:password>
    	<s:password label="重复密码" name="repwd" id="repwd"></s:password>
    	<s:textfield label="手机号码" name="reg.telnum" id="telnum"></s:textfield>
    	<s:textfield label="QQ号码" name="reg.qq" id="qq"></s:textfield>
    	<s:textfield label="邮箱地址" name="reg.email" id="email"></s:textfield>
    	<s:submit name="ok" value="提交"></s:submit>
    </s:form>
  </body>
</html>
