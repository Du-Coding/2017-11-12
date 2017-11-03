<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TagBasic.jsp' starting page</title>
    
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
    <h1>set、property与bean标记的使用方式</h1>
    <s:set var="uname" value="'Tom'" />
    <br>uname的值：<s:property value="#uname"/>
    <s:set var="price" value="12200.00"/>
    <br>工资是：<s:property value="#price"/>
    <s:set var="ls1" value="{1,2,3,4}" />
    <s:set var="ls2" value="{'one','two','three'}"/>
    <s:set var="m1" value="#{1:'陈奕迅',2:'张学友',3:'谭咏麟',4:'周杰伦'}" />
    <s:set var="m2" value="#{1:'男','female':'女'}"/>
    <!--<s:iterator value="#ls1" var="a1">
    	<s:property value="#a1"/><br>
    </s:iterator>-->
    <br>ls1的值<s:iterator value="#ls1">
    	<s:property/>
    </s:iterator>
    <br>ls1第二个数据：<s:property value="#ls1[1]"/>
    <br>ls2的值：<s:iterator value="#ls2" var="a2">
    	<s:property value="#a2"/>
    </s:iterator>
    <br>m1全部值：<s:iterator value="#m1">
    	<s:property value="#key"/>
    	<s:property value="value"/>
    </s:iterator>
    <br>输出m2中female的值：<s:property value="#m2['female']"/><hr>
    <h1>bean标记的使用</h1>
    <s:bean var="u" name="pojo.LoginBeen">
    	<s:param name="uname" value="'Tiger'"/>
    	<s:param name="upwd" value="'12345'"/>
    </s:bean>
    <s:if test="#u.upwd.length()<6">
    	密码太简单
    </s:if>
    <s:else>
    	<br>用户信息：<s:property value="#u.uname"/>
    	<s:property value="#u.upwd"/>
    	<br>push用户信息<s:push value="u">
    		<s:property value="uname"/>
    		<s:property value="upwd"/>
    	</s:push>
    </s:else>
    <!--  <br>用户信息：<s:property value="#u.uname"/>
    <s:property value="#u.upwd"/>
    <br>push用户信息<s:push value="u">
    	<s:property value="uname"/>
    	<s:property value="upwd"/>
    </s:push>--><hr>
    
    
    <h1>if语句的使用</h1>
    <s:set var="name" value="'关羽'"/>
    <s:set var="salary" value="8000"/>
    <s:if test="#salary>=5000">
    	<s:property value="name"/>的工资是<s:property value="#salary"/>,不错
    </s:if>
    <s:elseif test="5000 > #salary && #salary >= 2000">
    	<s:property value="name"/>的工资是<s:property value="#salary"/>,有点少
    </s:elseif>
    <s:else>
    	<s:property value="name"/>的工资是<s:property value="#salary"/>,少
    </s:else> 
    
    <s:set var="tra" value="{'张学友','陈奕迅','周杰伦','刘德华'}"/>
    <br><s:iterator value="#tra" var="tr" status="stu">
    	<br>第<s:property value="#stu.count"/>个人的信息是：
    	<s:if test="#stu.odd">
    		<font color="red">
    			<s:property value="#tr"/>
    		</font>
    	</s:if>
    	<s:else>
    		<s:property value="#tr"/>
    	</s:else>
    </s:iterator><hr>
    
    
    <h1>merge、append标记的用法 </h1>
    <s:merge var="mlist">
    	<s:param value="tra"/>
    	<s:param value="{'周润发','梁朝伟','张国荣','周星驰'}"/>
    </s:merge>
    <br>输出merge标记用法的值：<s:iterator value="#mlist">
    	<s:property/>
    </s:iterator><br>
    <s:append var="alist">
    	<s:param value="tra"/>
    	<s:param value="{'周润发','梁朝伟','张国荣','周星驰'}"/>
    </s:append>
    <br>输出append标记用法的值：<s:iterator value="#alist">
    	<s:property/>
    </s:iterator><hr>
    
    
    <h1>sort、date、include、generator、subset标记的用法 </h1>
    <s:set var="nums" value="{'a','dddd','ccc','bb','ee'}" />
    <s:bean name="sort.SortTag"var="sort" />
    <br><s:sort source="nums" comparator="#sort">
    	<s:iterator>
    		<s:property/>
    	</s:iterator>
    </s:sort>
    <s:bean name="java.util.Date" var="dat"/>
    <br>当前的时间和日期：<s:date name="dat" format="yyyy-MM-dd HH:mm:ss"/>
    <br>当前的时间和日期：<s:date name="dat" format="yyyy年MM月dd日  HH时mm分ss秒"/>
    <br><s:generator separator=",;." val="'Tiger;Tom,Jerry.'">
    	<s:iterator>
    		<s:property/>
    	</s:iterator>
    </s:generator>
    <br><s:include value="Login.jsp"></s:include>
    <br><s:subset source="tra" start="1" count="3">
    	<s:iterator>
    		<s:property/>
    	</s:iterator>
    </s:subset><hr>
    
    
    <h1>a、url标记的用法</h1>
    <a href="<s:url value='http://www.douyu.com/96291'/>" >百度</a>
    <br><s:url value='http://www.baidu.com'/>
    <br><s:url namespace="/" action="session.action" var="sc1"/>
    <s:url namespace="/" action="session.action" var="sc2">
    	<s:param name="id" value="111"/>
    </s:url>
    <s:a href="%{sc1}">aaa</s:a>
    <s:a href="%{sc2}">bbb</s:a>
  </body>
</html>
