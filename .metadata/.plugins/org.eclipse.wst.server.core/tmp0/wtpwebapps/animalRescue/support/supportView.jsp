<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@page import="vo.Member"%> 
<%
	Member member = (Member)session.getAttribute("member"); 
%>  
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
		<title>詳細内容</title>
		<style type="text/css">
			<style type="text/css">
			#LeftMenuArea{float:left; padding-top:34px; padding-left:20px; padding-right:30px; height:100%; padding-bottom:50px;}
			.LeftMenu{float:left; width:200px;}
			.LeftMenu li{line-height:20px; font-size:0px;}
			.top_content{
				padding : 18px; 
				background-color : skyblue;
				text-align : center;
				margin-bottom : 3px;
			}
			img {height : auto; width : 300px;}
			.contable{width : 600px;}
			td{background-color : #B2CCFF; width : 90px; text-align : center;}
			.tab {
		 		float: left;
		 		border: 1px solid #ccc;
		  		background-color: #f1f1f1;
		  		width: 25%;
		  		height: 300px;
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
		</style>
	</head>
	<body>
		<div class="hb">
			<jsp:include page="/main/mainBody.jsp"/>
		</div>
		<div class="header">
			<jsp:include page="/main/mainHeader.jsp"/>
		</div>
			<div class = "tab">
				<button onclick = "location.href='/animalRescue/list.anires?page=1'">病院リスト</button>
				<button onclick = "location.href='/animalRescue/protectList.anires?page=1'">保護センターリスト</button>
				<button onclick="location.href='/animalRescue/supportboard.anires'">サポート掲示板</button>
			</div>
		<form>
			<div id="ContentArea">
				<table class = "contable">
					<tr>
						<td>タイトル</td>
						<th colspan = "3">${support.subject}</th>
					</tr>
					<tr>
						<td>サポート口座</td>
						<th colspan = "3">
							${support.account}
						</th>
					</tr>
					</tr>
						<td>希望金額</td>
						<th>
							${support.money}
						</th>
						<td>登録日</td>
						<th>${support.date}</th>
					</tr>
					<tr>
						<td>お名前</td>
						<th>${support.name}</th>
						<td>連絡先</td>
						<th>${support.phone}</th>
					</tr>
					<tr>
						<th colspan = "2">
							<img src = "/animalRescue/img/${support.image }"/>
						</th>
						<th colspan = "2">
							${support.content}
						</th>
					</tr>
					<tr>
						<th colspan = "4">
							<c:if test = "${member.id==support.id}">
								<input type = "button" value="修正" onclick = "location.href='/animalRescue/supportModify.anires?snum=${support.snum }'"/>
								<input type = "button" value ="削除" onclick = "location.href='/animalRescue/supportDelete.anires?snum=${support.snum }'"/>
							</c:if>
							<c:if test="${member.id=='admin'}">
								<input type = "button" value ="削除" onclick = "location.href='/animalRescue/supportDelete.anires?snum=${support.snum }'"/>
							</c:if>
							<input type="button" value = "戻る" onclick = "history.back()"/>
						</th>
					</tr>
				</table>
			</div>
		</form>
		<jsp:include page="/main/mainFooter.jsp"/>
	</body>
</html>