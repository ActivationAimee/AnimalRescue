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
		<title>Insert title here</title>
		<link href="${pageContext.request.contextPath }/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/jquery.bxslider.css" rel="stylesheet"> 
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
		<style type="text/css">
			.w40{height:20px;}
		</style>
		<script type="text/javascript">
			function showConfirm(){
				if(confirm("削除しますか。")){
					alert("削除しました。");
				}else{
					alert("削除が取り消しました。");
				}
			}
		</script>
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
		<form name="member" method="post" action = "/animalRescue/deleteId.anires?id=${member.id}">
			<h2>マイページ</h2><br><br>
				<caption class="readonly"> ユーザー情報</caption><br><br> 
				<colgroup>
					<col width="20%">
					<col width="*">
				</colgroup>
				<tbody>
					<tr>
						<th>ID:</th>&nbsp;&nbsp;&nbsp;
						<td name="id">${member.id }</td>
						
					</tr><br>
					
					<tr>	
						<th>PW:</th>&nbsp;&nbsp;&nbsp;
						<td >${member.pass }</td>
											
					</tr><br>
					
					<tr>
						<th>お名前:</th>&nbsp;&nbsp;&nbsp;
						<td>${member.name }</td>
						
					</tr><br>
					
					<tr>
						<th>電話番号:</th>&nbsp;&nbsp;&nbsp;
						<td>${member.phone }</td>
						
					</tr><br>
					
					<tr>
						<th>年齢:</th>&nbsp;&nbsp;&nbsp;
						<td>${member.age }</td>
						
					</tr><br><br><br>
					
					<tr>
						<td colspan="2" class="txtc">
						<input type="button" value="修正" class="btn_ok" onclick = "location.href='mem_updateForm.jsp'"/>&nbsp;&nbsp;
						<input type="submit" value="脱退" class="btn_reset" onclick="showConfirm()"/>&nbsp;&nbsp;
						<a href="main/mainForm.jsp"><input type="button" value="MAIN"  class="btn_reset"/></a>
					</tr>
				</tbody>
		</form>
		</div>
	</div>
	<div class="w1200">
		<jsp:include page="/main/mainFooter.jsp"></jsp:include>
	</div>
</body>
</html>