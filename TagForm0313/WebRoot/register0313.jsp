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
				alert("�˺Ÿ�ʽ����");
				document.myform.unum.focus();
				return false;
			}
			var uname = document.myform.uname.value;
			var exp2 = new RegExp(/^\W{2,}$/);
			if(!exp2.test(uname)){
				alert("���ָ�ʽ����");
				document.myform.uname.focus();
				return false;
			}
			var upwd = document.myform.upwd.value;
			var exp3 = new RegExp(/^\d{5,}$/);
			if(!exp3.test(upwd)){
				alert("�����ʽ����");
				document.myform.upwd.focus();
				return false;
			}
			var repwd = document.myform.repwd.value;
			if(repwd!=upwd){
				alert("��������ͬ������");
				document.myform.repwd.focus();
				return false;
			}
			var telnum = document.myform.telnum.value;
			var exp4 = new RegExp(/^\d{11}$/);
			if(!exp4.test(telnum)){
				alert("��������ȷ��11λ����");
				document.myform.telnum.focus();
				return false;
			}
			var qq = document.myform.qq.value;
			var exp5 = new RegExp(/^\d{5,10}$/);
			if(!exp5.test(qq)){
				alert("qq��ʽ����5-10λ����");
				document.myform.qq.focus();
				return false;
			}
			
			var email = document.myform.email.value;
			var exp6 = RegExp(/^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/);
			if(!exp6.test(email)){
				alert("�����ʽ����");
				document.myform.email.focus();
				return false;
			}
		}
	</script>
  </head>
  
  <body>
    <s:form action="register" method="post" name="myform" id="myform" onsubmit="return test()">
    	<s:textfield label="��Ա�˺�" name="reg.unum" id="unum"></s:textfield>
    	<s:textfield label="��ʵ����" name="reg.uname" id="uname"></s:textfield>
    	<s:password label="��¼����" name="reg.upwd" id="upwd"></s:password>
    	<s:password label="�ظ�����" name="repwd" id="repwd"></s:password>
    	<s:textfield label="�ֻ�����" name="reg.telnum" id="telnum"></s:textfield>
    	<s:textfield label="QQ����" name="reg.qq" id="qq"></s:textfield>
    	<s:textfield label="�����ַ" name="reg.email" id="email"></s:textfield>
    	<s:submit name="ok" value="�ύ"></s:submit>
    </s:form>
  </body>
</html>
