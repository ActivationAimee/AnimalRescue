﻿<%@page import="vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member = (Member)session.getAttribute("member"); 	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Save the animal</title>
		<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/jquery.bxslider.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
	</head>
	<body>
		<div class="hb">
			<jsp:include page="/main/mainBody.jsp"></jsp:include>
		</div>
		<div class="header">
			<jsp:include page="/main/mainHeader.jsp"></jsp:include>
		</div>	
		<div class="contents">
		<div class="regbox">
		<form name="member" method="post" action="/animalRescue/modifyId.anires">
			<h2> ユーザー修正</h2>
			<table summary="ID、PW、名前이름、電話番号、メールアドレス入力があります。" class="member_table">
				<caption class="readonly">ユーザー修正表</caption> <!-- 표 제목 -->
				<colgroup>
					<col width="20%">
					<col width="*">
				</colgroup>
				<tbody>
					<tr>
						<th>ID</th>
						<td><input type="text" name="id" value="${member.id}" class="w80" readonly="readonly"></td>
					</tr>
					<tr>
						<th>PW</th>
						<td><input type="text" name="pwd" value="${member.pass }" class="w80"></td>
					</tr>
					<tr>
						<th>お名前</th>
						<td><input type="text" name="name" value="${member.name }" ></td>
					</tr>
					<tr>
						<th>電話番号</th>
						<td><input type="text" name="phone" value="${member.phone }" class="w80"></td>
					</tr>
					<tr>
						<th>年齢</th>
						<td><input type="number" name="age" value="${member.age }" class="w80"></td>
					</tr>
					<tr>
						<td colspan="2" class="txtc">
						<input type="submit" value="修正" class="btn_ok"/>&nbsp;&nbsp;
						<input type="reset" value="書き直す"  class="btn_reset"/>
						<input type="button" value="MAIN"  class="btn_reset" onclick="location.href='main/mainForm.jsp'"/>
					</tr>
				</tbody>
			</table>
		</form>
		</div>
		</div>
		<div class="w1200">
			<jsp:include page="/main/mainFooter.jsp"></jsp:include>
		</div>	
	</body>
</html>