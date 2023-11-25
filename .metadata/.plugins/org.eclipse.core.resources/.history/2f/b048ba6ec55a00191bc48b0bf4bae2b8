<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/js/script.js"></script>
</head>
<body>
<div align="center">
		<c:if test="${error != null} " >
			<h3>${error}</h3>
		</c:if>
		<form action="adopt_modifycheck.anires" method="post" name="aw" onsubmit="return check()">
			<input type="hidden" name="ani_no" value="${ani_no}">
			パスワード : &nbsp;&nbsp;&nbsp;&nbsp;
			<input type="password" name="pass"><br><br>
			<input type="submit" value="OK" class="btn_ok">
		</form>
	</div>
</body>
</html>