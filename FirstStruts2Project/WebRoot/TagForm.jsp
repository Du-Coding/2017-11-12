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
  	    	//�û�����֤
  	    	var name = document.myform.uname.value;
  	    
  	    	
  	    	var exp = new RegExp(/^[a-zA-Z][a-zA-Z0-9_]{2,9}$/);
  	    	if(!exp.test(name)){
  	    		alert("�û�����ʽ����");
  	    		document.myform.uname.focus();
  	    		return false;//��ֹ����ִ��
  	    	}
  	    	
  	    	//������֤
  	    	var pwd = document.myform.upwd.value;
  	    	var exp2 =new RegExp(/^[0-9]{5,}$/); 
  	    	if(!exp2.test(pwd)){
  	    		alert("�����ʽ����");
  	    		document.myform.upwd.focus();
  	    		return false;//��ֹ����ִ��
  	    	}
  	    	
  	    }
    </script>

  </head>
  
  <body>
    <h1>����ǵ��÷�</h1>
    <s:fielderror/>
    <s:form action="tagform" method="post" id="myform" name="myform" onsubmit="return validate()">
    	<s:textfield label="�û���" name="uname" id="uname"></s:textfield>
    	<s:password label="����" name="upwd" id="upwd"></s:password>
    	<s:textarea label="����" name="content" ></s:textarea>
    	<s:radio label="�Ա�" name="gender1" list="{'��','Ů'}" value="'��'"></s:radio>
    	<s:radio label="�Ա�" name="gender2" list="#{1:'��',2:'Ů'}" value="1"></s:radio>
    	<s:checkbox label="����Ѹ" fieldValue="����Ѹ" name="star1"></s:checkbox>
    	<s:checkbox label="��ѧ��" fieldValue="��ѧ��" name="star1"></s:checkbox>
    	<s:checkbox label="�ܽ���" fieldValue="�ܽ���" name="star1"></s:checkbox>
    	<s:checkboxlist label="����" list="{'��ѧ��','����Ѹ','�ܽ���'}" name="star2" value="'��ѧ��'"></s:checkboxlist>
    	<s:checkboxlist label="����" list="#{'̷ӽ��':'̷ӽ��','÷�޷�':'÷�޷�','�Ź���':'�Ź���'}" name="star3" value="'̷ӽ��'"></s:checkboxlist>
    	<s:set var="like" value="#{'�⽻��':'�⽻��','������':'������','������':'������' }"></s:set>
    	<s:checkboxlist label="��������" list="like" name="NB" value="�⽻��"></s:checkboxlist>
    	<s:select list="{'��ɳ','�ҿ�','�س�'}" label="��ϲ���ͺ�" name="city1"></s:select>
    	<s:select list="#{'����':'����','�Ϻ�':'�Ϻ�','����':'����' }" label="�㰮������" name="city2" multiple="true"></s:select>
    	<s:submit name="ok" value="�ύ" ></s:submit>
    	<s:reset name="reset" value="����"></s:reset>
    </s:form>
  </body>
</html>
