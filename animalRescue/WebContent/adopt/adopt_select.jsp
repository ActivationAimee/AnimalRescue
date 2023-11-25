<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "vo.Member" %>  
<%
	Member member = (Member)session.getAttribute("member"); 
%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/js/script.js"></script>
<style type="text/css">
.tab {
	float: left;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
	width: 25%;
	height: 300px;
}

.mid_content {
	width: 74.5%;
	float: left;
	margin-left: 5px;
}

.top_content {
	padding: 18px;
	background-color: skyblue;
	text-align: center;
	margin-bottom: 3px;
}

.tab button {
	display: block;
	background-color: inherit;
	color: black;
	padding: 22px 16px;
	width: 100%;
	border: none;
	outline: none;
	text-align: left;
	cursor: pointer;
	font-size: 17px;
}

.tab button:hover {
	background-color: #ddd;
}

.tab button.active {
	background-color: #ccc;
}

table.type01 {
	border-collapse: separate;
	border-spacing: 1px;
	text-align: center;
	line-height: 1.5;
	border-top: 1px solid #ccc;
	margin: 20px 10px;
}

td.style1 {
	width: 150px;
	padding: 10px;
	font-weight: bold;
	vertical-align: top;
	border-bottom: 1px solid #ccc;
	background: #efefef;
}

td.style2 {
	width: 350px;
	vertical-align: top;
	border: 1px solid #ccc;
}

/* #listbutton {
	display: block;
	background-color: inherit;
	color: black;
	padding: 15px 10px;
	border: none;
	outline: none;
	text-align: left;
	cursor: pointer;
	font-size: 14px;
} */
</style>
<script type="text/javascript">
function go(){
	opener.location.href="adopt_list.anires";
	self.close();
}
</script>
</head>
<body>
	<div align="center" >
		<form action="adopt/adopt_select.anires" method="post">
			<table class="type01">
				<tr>
					<td>
						<c:if test="${img == null}">
							<img src="/animalrescue/img/timo.jpg" name="img" width="400px" height="400px" >
						</c:if>
						<c:if test="${img !=null }">
							<img src="/animalRescue/img/${img}" name="img" width="400px" height="400px">
						</c:if>
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">動物  : 
							<c:if test="${kind =='kind_dog'}">
								犬
							</c:if>
							<c:if test="${kind =='kind_cat'}">
								猫
							</c:if>
							<c:if test="${kind =='kind_bird'}">
								鳥類
							</c:if>
							<c:if test="${kind =='kind_repamp'}">
								爬虫類・両生類
							</c:if>
							<c:if test="${kind =='kind_small'}">
								その他
							</c:if><br>
					</td>
				</tr>
			</table>
			<table border="1">
				<tr>
					<td class="style1">
						タイトル<br>
					</td>
					<td class="style1">
						${aa.ani_subject}<br>
					</td>
				</tr>
				<tr>
					<td class="style1">
						欲しい日<br>
					</td>
					<td class="style1"> 
						${aa.ani_date}<br>
					</td>
				</tr>
				<tr>
					<td class="style1">
						お名前<br>
					</td>
					<td class="style1">
						${aa.ani_name}<br>
					</td>
				</tr>
				<tr>
					<td class="style1">
						連絡先<br>
					</td>
					<td class="style1">
						${aa.ani_tel}<br>
					</td>
				</tr>
				<tr>
					<td class="style1">
						内容<br>
					</td>
					<td class="style1">
						<pre>${aa.ani_content}</pre>
					</td>
				</tr>
			</table>
			<table>
				<tr>
					<td>
						<input type="button" value="close" onclick="go()" class="btn_ok">
					</td>
					<td align="right" >
						<input type="button" value="修正し"  class="btn_ok" onclick="location.href='adopt_modifycheck.anires?ani_no=${aa.ani_no}'">
					</td>
					<td>
						<input type="button" value="デリート" class="btn_ok" onclick="location.href='adopt_deleteForm.anires?ani_no=${aa.ani_no}&id=${member.id}'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>