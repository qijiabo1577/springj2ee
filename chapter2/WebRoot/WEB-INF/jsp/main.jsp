<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>宝宝淘论坛登录</title>
	</head>
	<body>
		你好~<font color="red"><c:out value="${user.userName}"/></font>。欢迎登陆~<br>
		积分：<c:out value="${user.credits}"/>
	</body>
</html>