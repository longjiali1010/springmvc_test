<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>主页</title>

</head>

<body>
	<div>
		<a href="/springmvc_5/c/members/load1">会员列表页面</a>&nbsp;&nbsp;&nbsp;
		<a href="/springmvc_5/c/members/load2">商品列表页面</a>&nbsp;&nbsp;&nbsp;
		<h1 align="center">
			欢迎<span style="color: red;">【${sessionScope.USERS.userName}】</span>会员登录成功
		</h1>
		<a href="javascript:void(0)">注销</a>
	</div>
</body>
</html>
