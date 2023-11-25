﻿<%@page import="vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member = (Member)session.getAttribute("member"); 
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ログイン成功</title>
		<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/jquery.bxslider.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
		<style type="text/css">
			.lo{text-align:center;}
		
		</style>
	</head>
	
	<body>
		<div class="hb">
			<jsp:include page="/main/mainBody.jsp"></jsp:include>
		</div>
		<div class="header">
			<jsp:include page="/main/mainHeader.jsp"></jsp:include>
		</div>
		
	<div class="contents">
		<div class="formsucbox">
		
			<form name="login" method="post">
				
				<h3 class="lo">ログインに成功しました。</h3><br>
				<h4 class="lo">${member.name}様、WELCOME!</h4><br><br>
				<br><br>
				
				<div class="lo">
				<input type="button" value="確認" class="btn_ok" onclick ="location.href='main/mainForm.jsp'"/>
				
				</div>
			</form>	
			
		</div>
	</div>	
	
	<div class="w1200">
		<jsp:include page="/main/mainFooter.jsp"></jsp:include>
	</div>
	</body>
</html>