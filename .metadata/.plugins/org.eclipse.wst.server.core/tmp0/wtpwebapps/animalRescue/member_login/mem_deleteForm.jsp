<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				if(confirm("アカウントを削除しますか?")){
					alert("削除しました。");
				}else{
					alert("取り消し");
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
		<form name="member" method="post" action = "/animalRescue/deleteUser.anires?id=${member.id}">
			<h2>MyPage</h2><br><br>
				<caption class="readonly"> 会員情報</caption><br><br> 
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
						<th>PASS:</th>&nbsp;&nbsp;&nbsp;
						<td >${member.pass }</td>
											
					</tr><br>
					
					<tr>
						<th>名前:</th>&nbsp;&nbsp;&nbsp;
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
						<input type="submit" value="削除" class="btn_reset" onclick="showConfirm()"/>&nbsp;&nbsp;
						<input type="button" value="戻る"  class="btn_reset" onclick = "location.href='/animalRescue/listUser.anires'"/>
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