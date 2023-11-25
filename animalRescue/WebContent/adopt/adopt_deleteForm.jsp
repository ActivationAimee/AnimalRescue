<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/jquery.bxslider.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
<style type="text/css">
	h3{
		color: red;
	}
</style>
<script type="text/javascript">
	function check(){
		if(aw.pass.value == ""){
			alert("パスワードが空白！");
			aw.pass.focus();
			return false;
		}
		return true;
	}
</script>
<body>
			<div class="hb">
				<jsp:include page="/main/mainBody.jsp"/>
			</div>
			<div class="header">
				<jsp:include page="/main/mainHeader.jsp"/>
			</div>
			
	<div align="center">
		<c:if test="${error != null} " >
			<h3>${error}</h3>
		</c:if>
		<form action="adopt_delete.anires" method="post" name="aw" onsubmit="return check()">
			<input type="hidden" name="ani_no" value="${ani_no}">
			パスワード : &nbsp;&nbsp;&nbsp;&nbsp;
			<input type="password" name="pass"><br><br>
			<input type="submit" value="OK" class="btn_ok">
		</form>
	</div>
	<jsp:include page="/main/mainFooter.jsp"/>
</body>
</html>