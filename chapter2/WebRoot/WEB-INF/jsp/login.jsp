<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>宝宝淘论坛登录</title>
	</head>
	<body>
		<c:if test="${!empty error}">
			<font color="red"><c:out value="${error}"/></font>
		</c:if>
		<form action="<c:url value='/loginCheck.html'/>" method="post">
			用户名：
			<input type="text">
		
		</form>
	</body>
</html>