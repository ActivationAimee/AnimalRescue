<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%@ page import ="java.sql.Date" %> 
<%@ page import = "vo.Member" %>    
<%
	Member member = (Member)session.getAttribute("member"); 
%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name = "viewport" content = "width = device-width, initial-scale=1">
		<link href="${pageContext.request.contextPath }/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/jquery.bxslider.css" rel="stylesheet">
		<title>サポート申し込み</title>
		<style type="text/css">
			a:ts {
				text-decoraction : none;
			}
			.tab {
		 		float: left;
		 		border: 1px solid #ccc;
		  		background-color: #f1f1f1;
		  		width: 25%;
		  		height: 300px;
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
		
			#listbutton{
					display: block;
				    background-color: inherit;
				    color: black;
				    padding: 15px 10px;
				    border: none;
				    outline: none;
				    text-align: left;
				    cursor: pointer;
				    font-size: 14px;
			}
		</style>
		
		<script type="text/javascript">
		function check_form() {
			if (supportW.subject.value == "") {
				alert("タイトルが空白");
				supportW.subject.focus();
				return false;
			}
			if(supportW.account.value == ""){
				alert("口座が空白");
				supportW.account.focus();
				return false;
			}
			if(supportW.money.value == ""){
				alert("金額が空白");
				supportW.money.focus();
				return false;
			}
			if (supportW.name.value == "") {
				alert("お名前が空白");
				supportW.name.focus();
				return false;
			}
			if (supportW.phone.value == "") {
				alert("連絡先が空白");
				supportW.phone.focus();
				return false;
			}
			if (supportW.content.value == "") {
				alert("内容が空白");
				supportW.content.focus();
				return false;
			}
			
			var phone = supportW.phone.value;
			var chk = /^((01[1|6|7|8|9])[1-9]+[0-9]{6,7})|(010[1-9][0-9]{7})$/;

			 if (chk.test(phone) == false) { 
			       alert("01012345678ような形式に入力してください");
			       supportW.phone.value = "";
			       supportW.phone.focus();
			       return false;
			 }
			 
			 return true;
		}
		</script>
	</head>
	<body>
		<form name = "supportW" method = "post" action = "/animalRescue/supportWrite.anires" enctype="Multipart/form-data" onsubmit="return check_form()">
		<input type = "hidden" name = "M_id" value = "${member.id }"/>
		<input type = "hidden" name = "M_name" value = "${member.name }"/>
			<div class="hb">
				<jsp:include page="/main/mainBody.jsp"/>
			</div>
			<div class="header">
				<jsp:include page="/main/mainHeader.jsp"/>
			</div>
			<div class = "top_content">
				<h2>サポート申請</h2>
			</div>
			<div class = "tab">
				<button onclick = "location.href='/animalRescue/list.anires?page=1'">病院リスト</button>
				<button onclick = "location.href='/animalRescue/protectList.anires?page=1'">保護センターリスト</button>
				<button onclick="location.href='/animalRescue/supportboard.anires'">サポート掲示板</button>
			</div>
			<div class = "mid_content">
				<table style="text-align: center;">
	        	<tr>
	            	<td width = "650">
	                <font size="5em">
	               		サポート申請
	                </font>
	                </td>
	            </tr>
	        </table>
			<table class="type01">
				 <tr>
					 <td class="style1">タイトル</td>
					 <td colspan="4" class="style2"><input type="text" name="subject" size="55" style="width:510px; height:36px; border:none"/></td>
				</tr>
				<tr>
					<td class="style1">サポート口座</td>
	                <td class="style2">
	                	<input type="text" name="account" style="width:170px; height:36px; border:none">
	                </td>
	                <td class="style1">希望金額</td>
	                <td class="style2">
	                	<input type="text" name="money" style="width:170px; height:36px; border:none">
	                </td>
				</tr>
	            <tr>
	            	<td class="style1">連絡先</td>
	                <td class="style2"><input type="text" name="phone" style="width:170px; height:36px; border:none"></td>
					<td class="style1">写真</td>
					<td class="style2"><input type = "file" name = "image"/></td>
	            </tr>
				<tr>
	            	<td class="style1">コンテンツ</td>
	                <td colspan="3" class="style2">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                <textarea rows="10" cols="65" name="content" style="width:520px; height:150px; border:none"></textarea>
	                </td>
				</tr>
			</table>
	        <table>
	        	<tr height="30">
					<td width = "650" align="right">
						<input type="submit" id="listbutton" value = "サポート申請"/>
	                </td>
	                <td width = "80" align="right">
	                	<input type="reset" id="listbutton" value ="リセット"/>
	                </td>
	                <td width = "80" aling="right">
	                	<input type = "button" id="listbutton" onclick = "history.back()" value = "戻る">
	                </td>
	            </tr>
	        </table>
			</div>
		</form>
		<jsp:include page="/main/mainFooter.jsp"/>
	</body>
</html>