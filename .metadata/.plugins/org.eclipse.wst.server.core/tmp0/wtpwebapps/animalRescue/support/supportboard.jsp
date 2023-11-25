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
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
		<title>サポート掲示板</title>
		<style type="text/css">
			#supportImage {
				width : auto; height:120px; margin : auto 0;
			}
			
			.tab {
		 		float: left;
		 		border: 1px solid #ccc;
		  		background-color: #f1f1f1;
		  		width: 25%;
		  		height: 700px;
		  		position:relative;
			}
		
			.mid_content{
				width : 74.5%;
				float : left;
				margin-left : 5px;
			}
		
			.top_content{
				padding : 18px; 
				background-color : skyblue;
				text-align : center;
				margin-bottom : 3px;
				font-family: 'Kosugi Maru', sans-serif;
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
			#listbutton{
			float: left;
			display: block;
			background-color: inherit;
			color: black;
			padding: 10px 5px;
			width: 13%;
			border: none;
			outline: none;
			text-align: center;
			cursor: pointer;
			font-size: 10px;
			margin-left : 10px;
			}
			#writebutton{
				float: right;
				display: block;
				background-color: inherit;
				color: black;
				padding: 10px 5px;
				width: 13%;
				border: none;
				outline: none;
				text-align: center;
				cursor: pointer;
				font-size: 10px;
				margin-left : 10px;
			}
			.btn_ok{
				float: right;
				   	background:#426aaa; 
				   	color : #fff;
				   	width : 200px; 
				   	height : 70px;
				    border : 0 none;
				    outline: none;
				    text-align: center;
				    cursor : pointer;
				    font-size: 14px;
				    margin-left : 10px;
			}
		</style>
	</head>
	<body lang = "ja">
			<div class="hb">
				<jsp:include page="/main/mainBody.jsp"/>
			</div>
			<div class="header">
				<jsp:include page="/main/mainHeader.jsp"/>
			</div>
			<div class = "top_content">
				<h2>サポート掲示板</h2>
			</div>
			<div class = "tab">
				<button onclick = "location.href='/animalRescue/list.anires?page=1'">病院リスト</button>
				<button onclick = "location.href='/animalRescue/protectList.anires?page=1'">保護センターリスト</button>
				<button onclick="location.href='/animalRescue/supportboard.anires'">サポート掲示板</button>
			</div>
		<form name = "animalS" method = "post" action="/animalRescue/supportboard.anires">
			<div id="ContentArea" >
					<div class = "mainContent">
						<c:if test = "${list ne null }">
							<table text-align = "center" >
								<tr>
									<c:forEach var = "support" items = "${list}" varStatus = "status">
									<c:if test = "${support.snum != null }">
									<td style = "width : 230px; margin-right:5px; text-align:center;">
										<a href = "supportView.anires?snum=${support.snum }">
										<img src = "img/${support.image }" id = "supportImage"/><br>
										${support.subject }
										</a> <br>
										登録日 : ${support.date }
									</td>
									<c:if test = "${((status.index+1) mod 4) == 0 }">
								</tr>
								<tr>
									</c:if>
									</c:if>
									</c:forEach>
						</c:if>
								</tr>
							</table>
						<c:if test = "${list == null }">
							<div class = "div_empty">
								掲示物がありません。
							</div>
						</c:if>	
						<c:if test="${page != null }">
				<div align="center" style ="text-align : 'center'">
					<c:forEach items = "${page}" var = "pagenum" varStatus="status">
						<a href ="list.hp?page=${status.index+1 }">${status.index+1 }</a>&nbsp;
					</c:forEach>
				</div>
			</c:if>
				</div>
			</div>
		</form>
		<c:if test = "${member!=null }">
		<p align="right">
			<button id = "writebutton" onclick = "location.href='/animalRescue/support/supportwrite.jsp'">サポート募集</button>
		</p>
		</c:if>
		<jsp:include page="/main/mainFooter.jsp"/>
	</body>
</html>