﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
	<head>
		<title>Save the animal</title>
		<meta charset="utf-8">
		<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/jquery.bxslider.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
	
	<script type="text/javascript">
		function checkValue(){
			var form=document.member;
			
			if(form.id.value==""){
				alert("IDを入力してください");
				return form.id.focus();
			}else if(form.pass.value==""){
				alert("PASSを入力してください");
				return form.pass.focus();
			}else if(form.name.value==""){
				alert("名前を入力してください");
				return form.name.focus();
			}else if(form.idnumber1.value=="" || form.idnumber2.value==""){
				alert("住民登録番号を入力してください")	
				return form.idnumber1.focus();
			}else if(form.phone.value==""){
				alert("電話番号を入力してください");
				return form.phone.focus();
			}else if(form.age.value==""){
				alert("年齢を入力してください");
				return form.age.focus();
			}else{
				alert("登録できました")
				form.submit();
			}
		}
		
		function checkId(){
			var form = document.member;
			var id1 = document.member.id.value;
			var special_pattern = /[`~!@#$%^&*|\\\'\";:\/?]/gi; 
			if(form.id.value==""){
				alert("IDを入力してください");
			}else if(special_pattern.test(id1) == true){
				alert("特殊文字は入力できません")
			}
			else{
				location.href="/animalRescue/idCheck.anires?id="+id1;
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
		
		<!-- content area-->
		<div class="contents">
		<div class="regbox">
		<form name="member" method="post" action="/animalRescue/insertId.anires">
			<h2>会員登録</h2>
			<table summary="名前,ID,PASS,電話番号,EMAIL入力があります">
				<caption class="readonly">登録フォーム</caption> <!-- 표 제목 -->
				<colgroup>
					<col width="20%">
					<col width="*">
				</colgroup>
				<tbody>
					
					<tr>
						<th>ID</th>
						<td>
						<input type="text" name="id" class="w80" value="${id}"/>
						<button type="button" onclick="checkId()" class="btn_conf">重複検査</button>
						<c:if test="${res == 1}">
						<script>
							alert("IDが重複されます");
						</script>
						</c:if>
						<c:if test="${res == 0}">
						<script>
							alert("使用できるIDです");
						</script>
						</c:if>
						</td>
					</tr>
					<tr>
						<th>PASS</th>
						<td><input type="password" name="pass" class="w80"></td>
					</tr>
					<tr>
						<th>名前</th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th>住民登録番号</th>
						<td><input type="text" name="idnumber1" maxlength="6"> - <input type="password" name="idnumber2" maxlength="7"></td>
					</tr>
					<tr>
						<th>電話番号</th>
						<td><input type="text" name="phone" class="w80"></td>
					</tr>
					<tr>
						<th>年齢</th>
						<td><input type="text" name="age" class="w80"></td>
					</tr>
					<tr>
						<td colspan="2" class="txtc"/>
						<input type="button" value="登録" class="btn_ok" onclick = "return checkValue()"/>&nbsp;&nbsp;
						<input type="reset" value="取り消し"  class="btn_reset" onclick = "history.back()"/>&nbsp;&nbsp;
						<input type="button" value="メインページへ" class="btn_ok" onclick="location.href='/animalRescue/main/mainForm.jsp'"/>
					</tr>
				</tbody>
			</table>
		</form>
		</div>
		</div>
		<!--content end -->
		
		<div class="w1200">
			<jsp:include page="/main/mainFooter.jsp"></jsp:include>
		</div>
		
		</body>
	</html>