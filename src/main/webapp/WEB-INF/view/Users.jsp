<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP视图</title>
</head>
<body>
	<h1>JSP视图</h1>
	<h1>接收模型数据:</h1>
	<h3>${requestScope.DATA.userId}&nbsp;${requestScope.DATA.userName}&nbsp;${requestScope.DATA.userPwd}&nbsp;${requestScope.DATA.userDate}</h3>
	<h3>集合属性:</h3>
	<c:forEach items="${requestScope.DATA.roles}" var="temp">
		<h4>${temp}</h4>
	</c:forEach>

</body>
</html>