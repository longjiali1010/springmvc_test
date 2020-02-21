<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登录</title>


</head>

<body>
	<h1 style="color:red;">${requestScope.MSG}</h1>
	<div>
		<form action="/springmvc_5/c/members/loginIn" method="GET">
			<table>
				<tr>
					<td>用户名:</td>

					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>密&nbsp;码:</td>
					<td><input type="password" name="userPwd" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="登录" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
